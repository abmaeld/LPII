import java.util.*;

/**
 * A Taxi Company manages a fleet of taxis and shuttles.
 * Taxis move between single destinations.
 * Shuttles move around circular routes.
 * 
 * @author David J. Barnes 
 * @version 2010.12.03
 */

public class TaxiCo {

    // The name of this company.
    private String companyName;
    // The name of the company's base.
    private final String base;    
    // The fleet of vehicles.
    private ArrayList<Vehicle> vehicleFleet;
    // A value for allocating taxi ids.
    private int nextTaxiID;
    // A value for allocating shuttle ids.
    private int nextShuttleID;
    // A list of available destinations for shuttles.
    private ArrayList<String> destinations;

    /**
     * Constructor for objects of class TaxiCo.
     * @param name The name of this company.
     */

    public TaxiCo(String name) {

        companyName = name;
        base = "base";
        vehicleFleet = new ArrayList<Vehicle>();
        nextTaxiID = 1;
        nextShuttleID = 1;
        destinations = new ArrayList<String>();
        fillDestinations();

    }
    
    /**
     * Record that we have a new taxi.
     * A unique ID will be allocated.
     */

    public void addTaxi() {

        Taxi taxi = new Taxi(base, "Car #" + nextTaxiID);
        vehicleFleet.add(taxi);
        // Increment the ID for the next one.
        nextTaxiID++;

    }
    
    /**
     * Record that we have a new shuttle.
     * An arbitrary route is assigned to it.
     */

    public void addShuttle() {

        // Sanity warning:
        // The following is a thoroughly contrived way to create a route!
        
        // Create a random list of destinations for its route.
        Collections.shuffle(destinations);
        ArrayList<String> route = new ArrayList<String>();
        // The starting point is always the base.
        route.add(base);
        // Decide on an (arbitrary) length for all routes.
        final int ROUTE_LENGTH = 3;

        for (int i = 0; i < ROUTE_LENGTH; i++) {

            route.add(destinations.get(i));

        }
        
        Shuttle shuttle = new Shuttle("Shuttle #" + nextShuttleID, route);
        vehicleFleet.add(shuttle);
        // Increment the ID for the next one.
        nextShuttleID++;

    }

    /**
     * Return the best vehicle if available to take to a certain destination.
     * @param destination The destination the passenger want to get to.
     * @return The matching vehicle, or null if no match is found.
     */

    public Vehicle find_best_vehicle(String destination) {

        Vehicle best_vehicle = null;

        for (Vehicle vehicle : vehicleFleet) {

            if (vehicle instanceof Shuttle) {

                if (vehicle.getDestination() == destination) {

                    best_vehicle = vehicle;

                }

            }

        }

        for (Vehicle vehicle : vehicleFleet) {

            if (vehicle instanceof Taxi) {

                if (best_vehicle == null) {

                    if (vehicle.getDestination() == null) {

                        best_vehicle = vehicle;

                    }

                }

            }

        }

        return best_vehicle;

    }

    /**
     * Find the best vehicle and print if there is a shuttle available or book a taxi instead.
     * @param destination The destination of the ride.
     * @return none.
     * @todo: get passenger's location, and set it as taxi's destination, when it arrives there, start the ride.
     */

    public void ride_to(String destination) {

        Vehicle vehicle = find_best_vehicle(destination);

        if (vehicle instanceof Taxi) {

            Taxi taxi = (Taxi) vehicle;
            taxi.book(destination);
            System.out.println("No shuttle found. A taxi was booked. " + taxi.getID() + " is at "+ taxi.getLocation() + " heading to " + taxi.getDestination());

        }

        else if (vehicle instanceof Shuttle) {

            System.out.println("Found a shuttle. " + vehicle.getID() + " is at " + vehicle.getLocation() + " heading to " + vehicle.getDestination());

        }


    }
    
    /**
     * Return the taxi with the given id.
     * @param id The id of the taxi to be returned.
     * @return The matching taxi, or null if no match is found.
     */

    public Vehicle lookup(String id) {

        boolean found = false;
        Vehicle vehicle = null;
        Iterator<Vehicle> it = vehicleFleet.iterator();

        while (!found && it.hasNext()) {

            vehicle = it.next();

            if (id.equals(vehicle.getID())) {

                found = true;
            }

        }

        if (found) {

            return vehicle;

        }

        else {

            return null;

        }

    }

    /**
     * Show the status of the fleet of taxis and shuttles (vehicles). 
     */

    public void showStatus() {

        System.out.println("Current status of the " + companyName + " fleet:\n");

        for (Vehicle vehicle : vehicleFleet) {

            if (vehicle instanceof Taxi) {

                System.out.println("    " + vehicle.getStatus());

            }

            else if (vehicle instanceof Shuttle) {

                System.out.println("    " + vehicle.getStatus());

            }

        }

        System.out.println();

    }
    
    /**
     * Put all the possible shuttle destinations in a list.
     */

    private void fillDestinations() {

        destinations.add("Canterbury West");
        destinations.add("Canterbury East");
        destinations.add("The University");
        destinations.add("Whitstable");
        destinations.add("Herne Bay");
        destinations.add("Sainsbury's");
        destinations.add("Darwin");

    }

}

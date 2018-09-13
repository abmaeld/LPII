public class Vehicle {
	
	// A unique ID for this vehicle.
    private String id;
    // The next destination of this vehicle 
    private String destination;
    // The location of this vehicle.
    private String location;

    public Vehicle(String id, String location, String destination) {

    	this.id = id;
    	this.location = location;
    	this.destination = destination;

    }

    /**
     * Return the ID of the vehicle.
     * @return The ID of the vehicle.
     */

    public String getID() {

        return id;

    }

    /**
     * Return the location of the vehicle.
     * @return The location of the vehicle.
     */

    public String getLocation() {

        return location;

    }
    
    /**
     * Return the destination of the vehicle.
     * @return The destination of the vehicle.
     */

    public String getDestination() {

        return destination;

    }

    /**
     * Set the intented location of the vehicle.
     * @param location The intended location.
     */

    public void setLocation(String location) {

        this.location = location;

    }

    /**
     * Set the intented destination of the vehicle.
     * @param destination The intended destination.
     */

    public void setDestination(String destination) {

        this.destination = destination;

    }

    /**
     * Return the status of this vehicle.
     * @return The status.
     */

    public String getStatus() {

    	String status;

    	if (destination != null) {

        	status = id + " at " + location + " headed for " + destination;

        }

        else {

        	status = id + " at " + location + " waiting for a ride";

        }

        return status;

    }
    
}
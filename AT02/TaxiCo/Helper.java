/**
 * The test class Helper.
 * Provides the beginning of a set of tests for program development.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */

public class Helper {

	private TaxiCo taxiCo1;

    /**
     * Default constructor for test class Helper
     */

    public Helper() {}

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */

	protected void setUp() {

		taxiCo1 = new TaxiCo("IMD's cars");
		taxiCo1.addTaxi();
		taxiCo1.addTaxi();
		taxiCo1.addShuttle();
		taxiCo1.addShuttle();
		taxiCo1.addShuttle();

	}

    /**
     * Test whether we can book a taxi.
     */

	public void testBook() {

		setUp();
		Taxi taxi1 = (Taxi) taxiCo1.lookup("Car #1");		
		taxi1.book("HIPER");

		if ("HIPER".equalsIgnoreCase(taxi1.getDestination()) ) {

			System.out.println("Passed");

		} 

		else { 

			System.out.println("Failed");

		}

	}

	/**
	 * Test the status of a taxi after it has arrived.
	 */

	public void testArrived() {

		Taxi taxi1 = (Taxi) taxiCo1.lookup("Car #1");
		taxi1.book("HIPER");
		taxi1.arrived();

		if (taxi1.getDestination() == null && "HIPER".equalsIgnoreCase(taxi1.getLocation())) {

			System.out.println("Passed");

		} 

		else { 

			System.out.println("Failed");

		}

	}

	public void testShowStatus() {

		taxiCo1.showStatus();

	}

	public void testRide_to(String destination) {

		taxiCo1.ride_to(destination);

	}

	public static void main(String[] args) {

		Helper helper = new Helper();

		System.out.print("\nTest 'booking a taxi': ");
		helper.testBook();

		System.out.println();
		helper.testShowStatus();
		
		System.out.print("Test 'taxi arrival'  : ");
		helper.testArrived();

		System.out.println();
		helper.testShowStatus();

		System.out.print("Test 'ride to The University': ");
		helper.testRide_to("The University");

		System.out.println();
		helper.testShowStatus();

	}

}



package scooter;

public class ScooterRentalTester {

    public static void main(String[] args) {
        // Creating a new rental company
        RentalCompany rentalCompany = new RentalCompany();

        // Adding a scooter to the rental company
        Scooter scooter = new Scooter();
        scooter.setModel("Sparrow X10");
        scooter.setBatteryLevel(100);
        scooter.setX(12.863241454896352);
        scooter.setY(48.067441667191055);
        scooter.setAvailable(true);
        rentalCompany.addScooter(scooter);

        // Renting the scooter and going from home to the university
        rentalCompany.rentScooter(scooter.getId());
        scooter.moveTo(41.71005520372688, 44.749444507229256);
        System.out.println("Travelling to the university...");

        // Leaving the scooter at the university
        rentalCompany.returnScooter(scooter.getId(),41.71005520372688, 44.749444507229256);
        System.out.println("Scooter left at the university.");

        // Waiting for an hour
        try {
            Thread.sleep(60 * 60 * 1000); // Sleeping for 1 hour (in milliseconds)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Renting the scooter again and going back home
        rentalCompany.rentScooter(scooter.getId());
        scooter.moveTo(12.863241454896352, 48.067441667191055);
        System.out.println("Returning home...");

        // Leaving the scooter near your home
        rentalCompany.returnScooter(scooter.getId(),-79.6760239913151, 44.40084753605878);
        System.out.println("Scooter left near your home.");
    }
}

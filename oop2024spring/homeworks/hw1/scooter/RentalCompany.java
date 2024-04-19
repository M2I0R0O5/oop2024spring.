package scooter;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a rental company that manages scooters.
 */
public class RentalCompany {

    private int uid = 0;
    List<Scooter> scooters = new ArrayList<>();

    /**
     * Retrieves a list of available scooters.
     *
     * @return List of available scooters
     */
    public List<Scooter> availableScooters() {
        List<Scooter> result = new ArrayList<>();
        for (Scooter scooter : scooters) {
            if (scooter.isAvailable()) {
                result.add(scooter);
            }
        }
        return result;
    }

    /**
     * Adds a scooter to the rental company.
     *
     * @param scooter The scooter to be added
     */
    public void addScooter(Scooter scooter) {
        scooter.setId(uid++);
        scooters.add(scooter);
    }

    /**
     * Removes a scooter from the rental company.
     *
     * @param id The ID of the scooter to be removed
     * @return True if the scooter is successfully removed, false otherwise
     */
    public boolean removeScooter(int id) {
        boolean removed = false;
        for (Scooter scooter : scooters) {
            if (scooter.getId() == id) {
                scooters.remove(scooter);
                removed = true;
                break;
            }
        }
        return removed;
    }

    /**
     * Rents a scooter with the specified ID.
     *
     * @param id The ID of the scooter to be rented
     */
    public void rentScooter(int id) {
        for (Scooter scooter : scooters) {
            if (scooter.getId() == id && scooter.isAvailable()) {
                scooter.setAvailable(false);
                return;
            }
        }
        System.out.println("Scooter with ID " + id + " is not available for rent.");
    }

    /**
     * Returns a rented scooter to the rental company.
     *
     * @param id The ID of the scooter to be returned
     * @param x  The new x-coordinate of the scooter
     * @param y  The new y-coordinate of the scooter
     */
    public void returnScooter(int id, double x, double y) {
        for (Scooter scooter : scooters) {
            if (scooter.getId() == id) {
                scooter.setAvailable(true);
                scooter.moveTo(x, y);
                return;
            }
        }
        System.out.println("Scooter with ID " + id + " does not belong to this rental company.");
    }

    /**
     * Displays information about all scooters managed by the rental company.
     */
    public void displayAllScooters() {
        System.out.println("Scooters managed by the rental company:");
        for (Scooter scooter : scooters) {
            System.out.println(scooter);
        }
    }
}
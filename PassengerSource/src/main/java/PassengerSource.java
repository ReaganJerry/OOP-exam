/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import java.util.Random;

public class PassengerSource {
    private Company company;
    private Random random;

    public PassengerSource(Company company) {
        this.company = company;
        this.random = new Random();
    }

    public void generatePassenger() {
        // Generate random pickup and destination locations
        Location pickup = new Location(random.nextInt(100), random.nextInt(100));
        Location destination = new Location(random.nextInt(100), random.nextInt(100));

        // Create a new passenger
        Passenger passenger = new Passenger(pickup, destination);

        // Request pickup from the company
        boolean scheduled = company.scheduleVehicle(passenger);

        if (scheduled) {
            System.out.println("Passenger scheduled successfully.");
        } else {
            System.out.println("No available vehicle for the passenger.");
        }
    }
}

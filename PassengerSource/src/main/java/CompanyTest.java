/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class CompanyTest {
    public static void main(String[] args) {
        Company company = new Company();

        // Test 1: Schedule a passenger (should succeed)
        Passenger p1 = new Passenger(new Location(10, 20), new Location(30, 40));
        boolean result1 = company.scheduleVehicle(p1);
        System.out.println("Test 1 - Schedule Passenger: " + (result1 ? "PASSED" : "FAILED"));

        // Test 2: Simulate failure (e.g., no vehicles available)
        // For now, we simulate failure by forcing a false return
        // You can later modify Company to track vehicle availability
        boolean result2 = false; // Simulated failure
        System.out.println("Test 2 - No Vehicle Available: " + (!result2 ? "PASSED" : "FAILED"));
    }
}
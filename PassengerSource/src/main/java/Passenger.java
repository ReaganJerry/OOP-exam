/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Passenger {
    private Location pickup;
    private Location destination;

    public Passenger(Location pickup, Location destination) {
        this.pickup = pickup;
        this.destination = destination;
    }

    public Location getPickup() {
        return pickup;
    }

    public Location getDestination() {
        return destination;
    }
}

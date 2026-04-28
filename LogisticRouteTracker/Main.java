package com.gla.LogisticRouteTracker;

public class Main {
    public static void main(String[] args) {

        Driver d = new Driver("A2356", "Shivam Tiwari");

        d.routeHistory.addCheckpoint(
                new DeliveryCheckpoint("C1", "Warehouse D", 50, 32, 41));

        d.routeHistory.addCheckpoint(
                new FuelCheckpoint("C2", "Pump 16", 90, 10, 19));

        d.routeHistory.addCheckpoint(
                new RestCheckpoint("C3", "Motel K", 11, 22, 50));

        d.routeHistory.addCheckpoint(
                new DeliveryCheckpoint("C4", "Client Hub", 59, 28, 47));

        d.printSummary();
    }
}
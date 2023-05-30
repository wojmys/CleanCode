package com.kodilla.good.patterns.challenges.flights;

public class App {
    public static void main(String[] args) {

        FlightService flightService = new FlightService();

        System.out.println("All possible connections");
        flightService.showAllConnections();
        System.out.println();

        System.out.println("Searching for flights from Warsaw: ");
        flightService.showConnection(flightService.searchArrivalsTo("Warsaw"));
        System.out.println();

        System.out.println("Searching for flights to Paris: ");
        flightService.showConnection(flightService.searchDeparturesFrom("Paris"));
        System.out.println();

        System.out.println("Searching for flight: Warsaw-Berlin via London");
        System.out.println(flightService.searchFlight("Warsaw","Berlin", "London"));
        System.out.println();

        System.out.println("Searching for flight: Tokio-Warsaw. Connection flight: any ");
        System.out.println(flightService.searchFlight("Tokio","Warsaw"));

    }
}

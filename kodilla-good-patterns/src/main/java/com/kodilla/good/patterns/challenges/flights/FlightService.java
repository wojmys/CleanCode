package com.kodilla.good.patterns.challenges.flights;

import java.util.HashSet;
import java.util.Set;

public class FlightService {

    Set<Flight> flights = new HashSet<>();

    public FlightService() {
        this.flights = flights;
        loadConnections();
    }

    private void loadConnections(){

        flights.add(new Flight("Warsaw","London"));
        flights.add(new Flight("London","Warsaw"));
        flights.add(new Flight("London","Berlin"));
        flights.add(new Flight("Berlin","London"));
        flights.add(new Flight("Frankfurt","Warsaw"));
        flights.add(new Flight("Warsaw","Frankfurt"));
        flights.add(new Flight("Warsaw","Moscow"));
        flights.add(new Flight("Moscow","Warsaw"));
        flights.add(new Flight("Tokio","London"));
        flights.add(new Flight("London","Tokio"));
        flights.add(new Flight("Warsaw","Praha"));
        flights.add(new Flight("Praha","Warsaw"));
        flights.add(new Flight("London","Praha"));
        flights.add(new Flight("Praha","London"));
        flights.add(new Flight("Paris","Bratislava"));
        flights.add(new Flight("Bratislava","Paris"));
        flights.add(new Flight("Warsaw","Paris"));
        flights.add(new Flight("Paris","Warsaw"));

    }

    public void showAllConnections(){
      showConnection(flights);
    }

    public void showConnection(Set<Flight>connection){
      connection.stream()
              .forEach(System.out::println);
    }



}

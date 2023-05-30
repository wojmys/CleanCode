package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightService {

    Set<Flight> flights = new HashSet<>();

    public FlightService() {
        this.flights = flights;
        loadConnections();
    }

    private void loadConnections() {

        flights.add(new Flight("Warsaw", "London"));
        flights.add(new Flight("London", "Warsaw"));
        flights.add(new Flight("London", "Berlin"));
        flights.add(new Flight("Berlin", "London"));
        flights.add(new Flight("Frankfurt", "Warsaw"));
        flights.add(new Flight("Warsaw", "Frankfurt"));
        flights.add(new Flight("Warsaw", "Moscow"));
        flights.add(new Flight("Moscow", "Warsaw"));
        flights.add(new Flight("Tokio", "London"));
        flights.add(new Flight("London", "Tokio"));
        flights.add(new Flight("Warsaw", "Praha"));
        flights.add(new Flight("Praha", "Warsaw"));
        flights.add(new Flight("London", "Praha"));
        flights.add(new Flight("Praha", "London"));
        flights.add(new Flight("Paris", "Bratislava"));
        flights.add(new Flight("Bratislava", "Paris"));
        flights.add(new Flight("Warsaw", "Paris"));
        flights.add(new Flight("Paris", "Warsaw"));
    }

    public void showAllConnections() {
        showConnection(flights);
    }

    public Set<Flight> searchFlight(String departure, String arrival, String via) {

        Set<Flight> connectingFlight = flights.stream()
                .filter(s -> (s.getDeparture().equals(departure) && s.getArrival().equals(via)) ||
                        (s.getDeparture().equals(via) && s.getArrival().equals(arrival)))
                .collect(Collectors.toSet());

        return connectingFlight;
    }

    public List<Flight> searchFlight(String departure, String arrival) {

        List<Flight> connectingFlight;

        Set<Flight> departures = flights.stream()
                .filter(s -> s.getDeparture().equals(departure))
                .collect(Collectors.toSet());

        Set<Flight> arrivals = flights.stream()
                .filter(s -> s.getArrival().equals(arrival))
                .collect(Collectors.toSet());

        connectingFlight = createSharedListViaLoop(departures, arrivals);
        return connectingFlight;
    }

    public List<Flight> createSharedListViaLoop(Set<Flight> listOne, Set<Flight> listTwo) {
        List<Flight> result = new ArrayList<Flight>();

        for (Flight one : listOne) {
            for (Flight two : listTwo) {
                if (one.getDeparture().equals(two.getArrival()) || one.getArrival().equals(two.getDeparture())) {
                    result.add(one);
                    result.add(two);
                }
            }
        }
        return result;
    }

    public Set<Flight> searchArrivalsTo(String departCity) {
        Set<Flight> arrivals = flights.stream()
                .filter(s -> s.getDeparture().equals(departCity))
                .collect(Collectors.toSet());

        return arrivals;
    }

    public Set<Flight> searchDeparturesFrom(String arrivalCity) {
        Set<Flight> departures = flights.stream()
                .filter(s -> s.getArrival().equals(arrivalCity))
                .collect(Collectors.toSet());

        return departures;
    }

    public void showConnection(Set<Flight> connection) {
        connection.stream()
                .forEach(System.out::println);
    }
}

import com.kodilla.good.patterns.challenges.flights.Flight;
import com.kodilla.good.patterns.challenges.flights.FlightService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class FlightAppTestSuite {

    @Test
    void searchingForFlightsToWarsaw() {

        //given
        FlightService flightService = new FlightService();
        Set<Flight>expected = new HashSet<>();
        expected.add(new Flight("Warsaw","London"));
        expected.add(new Flight("Warsaw","Frankfurt"));
        expected.add(new Flight("Warsaw","Moscow"));
        expected.add(new Flight("Warsaw","Praha"));
        expected.add(new Flight("Warsaw","Paris"));

        //when
        Set<Flight> actual=flightService.searchArrivalsTo("Warsaw");

        //then
        Assertions.assertEquals(expected,actual);

    }
}

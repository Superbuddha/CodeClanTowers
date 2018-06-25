import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Guest guest1;
    Bedroom bedroom1;
    DiningRoom diningRoom1;
    ConferenceRoom conferenceRoom1;

    Hotel hotel;

    @Before
    public void setUp() throws Exception {
        guest1 = new Guest("Joanna");
        conferenceRoom1 = new ConferenceRoom("Conference Room 1");
        diningRoom1 = new DiningRoom("Dining Room 1");
        bedroom1 = new Bedroom("Bedroom 1");
        hotel = new Hotel("CodeClanTowers");
    }
    @Test
    public void hasName() {
        assertEquals("CodeClanTowers",hotel.getName());
}
}

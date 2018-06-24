import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Hotel hotel;

    @Before

    public void SetUp() {
        hotel = new Hotel("CodeClanTowers");
    }
    @Test
    public void hasName() {
        assertEquals("CodeClanTowers",hotel.getName());
}
}

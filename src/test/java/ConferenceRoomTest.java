import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceroomTest {

    Guest guest1;
    ConferenceRoom conferenceRoom1;

    @Before
    public void SetUp() throws Exception{
        guest1 = new Guest ("Joanna");
        conferenceRoom1 = new ConferenceRoom("Conference Room 1", 150, 1000);
    }

    @Test
    public void getName() {
        assertEquals("Conference Room 1", conferenceRoom1.name);
    }
    @Test
    public void roomStartsEmpty(){
        assertEquals(0, conferenceRoom1.capacity);
    }
    @Test
    public void roomHasNightlyRate() {
        assertEquals(150, conferenceRoom1.getDailyRate());
    }
}

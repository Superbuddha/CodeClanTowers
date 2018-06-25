import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Guest guest1;
    Bedroom bedroom1;

    @Before
    public void SetUp() throws Exception{
        guest1 = new Guest ("Joanna");
        bedroom1 = new Bedroom("Room 1", 1, "Single Room",150);
    }

    @Test
    public void getName() {
        assertEquals("Room 1", bedroom1.name);
    }
    @Test
    public void roomStartsEmpty(){
        assertEquals(0, bedroom1.capacity);
    }
    @Test
    public void hasType(){
        assertEquals("Single Room", bedroom1.type);
    }

    @Test
    public void roomHasNightlyRate() {
        assertEquals(150, bedroom1.getNightlyRate());
    }
}

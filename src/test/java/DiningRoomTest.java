import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    Guest guest1;
    Guest guest2;
    DiningRoom diningRoom1;

    @Before
    public void setUp() throws Exception {
        guest1 = new Guest("Joanna");
        guest2 = new Guest("Henry");
        diningRoom1 = new DiningRoom("Dining Room 1", 25);
    }

    @Test
    public void hasName() {
        assertEquals("Dining Room 1");
    }
    @Test
    public void hasCapacity(){
        assertEquals(25, diningRoom1.getCapacity());
    }


    @Test
    public void canAddGuest() {
        diningRoom1.addGuest(guest1);
        assertEquals(1, diningRoom1.countGuest());
    }
    @Test
    public void canRemoveGuest({
        diningRoom1.removeGuest(guest1);
        assertEquals(0,diningRoom1.countGuest());
    }
}

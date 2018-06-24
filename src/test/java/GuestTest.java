import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest1;
    @Before

    public void Setup() throws Exception{
        guest1 = new Guest("Joanna");
    }

    @Test
    public void hasName() {
        assertEquals("Joanna",guest1.getName());
    }
}

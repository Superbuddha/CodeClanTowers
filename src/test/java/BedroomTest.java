import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom1;

    @Before
    public void SetUp() throws Exception{
        bedroom1 = new Bedroom("Room 1", 1,"Double Room");
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
        assertEquals("Double Room", bedroom1.type);

    }
}

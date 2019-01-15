import Attractions.Playground;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    private Playground playground;

    @Before
    public void setUp(){
        playground = new Playground("Sunshine Town", 4, 0,0.00, 3, 15);

    }

    @Test
    public void hasMaxAge() {
        assertEquals(15, playground.getMaxAge());
    }
}

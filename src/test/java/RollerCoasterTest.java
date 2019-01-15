import Attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollerCoasterTest {

    private RollerCoaster rollerCoaster;

    @Before
    public void setUp(){
        rollerCoaster = new RollerCoaster("Smiler", 12, 140, 4.80, 4);
    }

    @Test
    public void hasName() {
        assertEquals("Smiler", rollerCoaster.getName());
    }

    @Test
    public void hasMinAge() {
        assertEquals(12, rollerCoaster.getMinAge());
    }

    @Test
    public void hasMinHeight() {
        assertEquals(140, rollerCoaster.getMinHeight());
    }

    @Test
    public void hasDefaultCost() {
        assertEquals(4.80, rollerCoaster.getDefaultPrice(), 0.001);
    }

    @Test
    public void hasRating() {
        assertEquals(4, rollerCoaster.getRating());
    }
}

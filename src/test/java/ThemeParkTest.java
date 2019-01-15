import Attractions.Attraction;
import Attractions.Playground;
import Attractions.RollerCoaster;
import People.Visitor;
import WholeItems.ThemePark;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    private Visitor visitor1;
    private RollerCoaster attraction1;
    private Playground attraction2;
    private ThemePark themePark;

    @Before
    public void setUp() {
        attraction1 = new RollerCoaster("Smiler", 12, 140, 4.80, 4);
        attraction2 = new Playground("Sunshine", 4, 30, 1.00, 3, 15);
        themePark = new ThemePark("Rob's Fun Bonanza");
        visitor1 = new Visitor(16, 160, 40.00);
    }

    @Test
    public void hasName() {
        assertEquals("Rob's Fun Bonanza", themePark.getName());
    }

    @Test
    public void startsNoAttractions() {
        assertEquals(0, themePark.attractionCount());
    }

    @Test
    public void canAddAttraction() {
        themePark.addAttraction(attraction1);
        assertEquals(1, themePark.attractionCount());
    }

    @Test
    public void canAddAttractionsOfDifferentTypes() {
        themePark.addAttraction(attraction1);
        themePark.addAttraction(attraction2);
        assertEquals(2, themePark.attractionCount());
    }

    @Test
    public void canAddVisitors() {
    }
}

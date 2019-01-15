import People.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    private Visitor visitor;

    @Before
    public void setUp() {
        visitor = new Visitor(16, 160, 30.00);
    }

    @Test
    public void hasAge() {
        assertEquals(16, visitor.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(160, visitor.getHeight());
    }

    @Test
    public void hasMoney() {
        assertEquals(30.00, visitor.getMoney(), 0.001);
    }

    @Test
    public void canGainMoney() {
        visitor.gainMoney(10.00);
        assertEquals(40.00, visitor.getMoney(), 0.001);
    }

    @Test
    public void canLoseMoney() {
        visitor.loseMoney(10.00);
        assertEquals(20.00, visitor.getMoney(), 0.001);
    }
}

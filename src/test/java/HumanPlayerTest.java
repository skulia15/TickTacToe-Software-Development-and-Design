import org.junit.Test;
import static org.junit.Assert.*;

public class HumanPlayerTest {
    @Test public void testPointIsValid() {
        HumanPlayer p = new HumanPlayer();
        assertEquals(true, p.pointIsValid(1));
    }

    @Test public void testPointIsValidExpectFalse() {
        HumanPlayer p = new HumanPlayer();
        assertEquals(false, p.pointIsValid(10));
    }
}

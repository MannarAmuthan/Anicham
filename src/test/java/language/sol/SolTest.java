package language.sol;

import language.models.sol.Sol;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolTest {
    @Test
    public void shouldAbleToEquateTwoVaarthaigal() {
        Sol v1 = new Sol("க", "ல்");

        Sol v2 = new Sol("க", "ல்");

        assertEquals(v1,v2);
    }


}

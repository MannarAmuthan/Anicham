package language;

import language.models.Vaakiyam;
import language.models.sol.Sol;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VaakiyamTest {
    @Test
    public void testAbleToEquateTwoVaakiyam() {

        Vaakiyam one=new Vaakiyam();
        Sol v1 = new Sol("க", "ல்");
        one.add(v1);

        Vaakiyam two=new Vaakiyam();
        Sol v2 = new Sol("க", "ல்");
        two.add(v2);

        assertEquals(one,two);
    }
}

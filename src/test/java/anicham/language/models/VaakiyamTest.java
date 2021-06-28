package anicham.language.models;

import anicham.Anicham;
import anicham.language.models.Vaakiyam;
import anicham.language.models.sol.Sol;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VaakiyamTest {
    @Test
    public void testAbleToEquateTwoVaakiyam() {

        Vaakiyam one=new Vaakiyam();
        Sol v1 = Anicham.sol("கல்");
        one.add(v1);

        Vaakiyam two=new Vaakiyam();
        Sol v2 = Anicham.sol("கல்");
        two.add(v2);

        assertEquals(one,two);
    }
}

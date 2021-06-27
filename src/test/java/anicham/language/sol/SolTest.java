package anicham.language.sol;

import anicham.Anicham;
import anicham.language.models.sol.Sol;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolTest {
    @Test
    public void shouldAbleToEquateTwoSorkkal() {
        Sol v1= Anicham.sol("கல்");
        Sol v2= Anicham.sol("கல்");

        assertEquals(v1,v2);
    }


}

package anicham.language.models.sol;

import anicham.Anicham;
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

package anicham.language.sol;

import anicham.Processor;
import anicham.language.models.sol.Sol;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolTest {
    @Test
    public void shouldAbleToEquateTwoSorkkal() {
        Sol v1=Processor.sol("கல்");
        Sol v2=Processor.sol("கல்");

        assertEquals(v1,v2);
    }


}

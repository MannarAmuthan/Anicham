package language.sol;

import anicham.Processor;
import language.models.sol.Sol;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolTest {
    @Test
    public void shouldAbleToEquateTwoSorkkal() {
        Sol v1=Processor.process("கல்").sorkkal()[0];
        Sol v2=Processor.process("கல்").sorkkal()[0];

        assertEquals(v1,v2);
    }


}

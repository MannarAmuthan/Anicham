package language;

import anicham.Processor;
import language.models.Vaakiyam;
import language.models.sol.Sol;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VaakiyamTest {
    @Test
    public void testAbleToEquateTwoVaakiyam() {

        Vaakiyam one=new Vaakiyam();
        Sol v1 = Processor.process("கல்").sorkkal()[0];
        one.add(v1);

        Vaakiyam two=new Vaakiyam();
        Sol v2 = Processor.process("கல்").sorkkal()[0];
        two.add(v2);

        assertEquals(one,two);
    }
}

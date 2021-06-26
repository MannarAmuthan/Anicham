package language.sol;

import anicham.Processor;
import language.exceptions.SolException;
import language.models.sol.Sol;
import language.models.sol.Sorkkal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class SorkkalTest {

    @Test
    public void shouldGetSubstring() throws SolException {
        Sol v1 = Processor.process("புதுமைப்பித்தன்").sorkkal()[0];
        Sol expected=Processor.process("பித்தன்").sorkkal()[0];

        Sol actual = Sorkkal.substring(v1,4, 8);

        assertEquals(actual,expected);
    }

    @Test
    public void shouldThrowExceptionForIndexErrors() {
        Sol v1 = Processor.process("புதுமைப்பித்தன்").sorkkal()[0];

        try {
            Sorkkal.substring(v1,4, 9);
            fail();
        } catch (SolException solException) {
            assertEquals(solException.getMessage(),"Index out of bound");
        }

        try {
            Sorkkal.substring(v1,-1, 2);
            fail();
        } catch (SolException solException) {
            assertEquals(solException.getMessage(),"Negative indices found");
        }
    }

    @Test
    public void shouldReverseTheGivenSol() {
        Sol v1 = Processor.process("ஶ்ரீரங்கம்").sorkkal()[0];
        Sol expected=Processor.process("ம்கங்ரஶ்ரீ").sorkkal()[0];

        Sol actual = Sorkkal.reverse(v1);

        assertEquals(actual,expected);
    }

    @Test
    public void shouldRemoveTheElutthuFromSol() throws SolException {
        Sol v1 = Processor.process("ஶ்ரீரங்கம்").sorkkal()[0];
        Sol expected=Processor.process("ஶ்ரீரங்க").sorkkal()[0];

        Sol actual = Sorkkal.remove(v1,4);

        assertEquals(actual,expected);
    }
}

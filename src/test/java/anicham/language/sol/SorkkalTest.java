package anicham.language.sol;

import anicham.Processor;
import anicham.language.exceptions.SolException;
import anicham.language.models.sol.Sol;
import anicham.language.models.sol.Sorkkal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class SorkkalTest {

    @Test
    public void shouldGetSubstring(){
        Sol v1 = Processor.sol("புதுமைப்பித்தன்");
        Sol expected=Processor.sol("பித்தன்");

        Sol actual = Sorkkal.substring(v1,4, 8);

        assertEquals(actual,expected);
    }

    @Test
    public void shouldThrowExceptionForIndexErrors() {
        Sol v1 = Processor.sol("புதுமைப்பித்தன்");

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
        Sol v1 = Processor.sol("ஶ்ரீரங்கம்");
        Sol expected=Processor.sol("ம்கங்ரஶ்ரீ");

        Sol actual = Sorkkal.reverse(v1);

        assertEquals(actual,expected);
    }

    @Test
    public void shouldRemoveTheElutthuFromSol(){
        Sol v1 = Processor.sol("ஶ்ரீரங்கம்");
        Sol expected=Processor.sol("ஶ்ரீரங்க");

        Sol actual = Sorkkal.remove(v1,4);

        assertEquals(actual,expected);
    }
}

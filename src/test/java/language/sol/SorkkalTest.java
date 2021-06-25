package language.sol;

import language.exceptions.SolException;
import language.models.sol.Sol;
import language.models.sol.Sorkkal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class SorkkalTest {

    @Test
    public void shouldGetSubstring() throws SolException {
        Sol v1 = new Sol("பு","து","மை","ப்","பி","த்","த","ன்");
        Sol expected=new Sol("பி","த்","த","ன்");

        Sol actual = Sorkkal.substring(v1,4, 8);

        assertEquals(actual,expected);
    }

    @Test
    public void shouldThrowExceptionForIndexErrors() {
        Sol v1 = new Sol("பு","து","மை","ப்","பி","த்","த","ன்");

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
}

package language.vaarthai;

import language.exceptions.VaarthaiException;
import language.models.vaarthai.Vaarthai;
import language.models.vaarthai.Vaarthaigal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class VaarthaigalTest {

    @Test
    public void shouldGetSubstring() throws VaarthaiException {
        Vaarthai v1 = new Vaarthai("பு","து","மை","ப்","பி","த்","த","ன்");
        Vaarthai expected=new Vaarthai("பி","த்","த","ன்");

        Vaarthai actual = Vaarthaigal.substring(v1,4, 8);

        assertEquals(actual,expected);
    }

    @Test
    public void shouldThrowExceptionForIndexErrors() {
        Vaarthai v1 = new Vaarthai("பு","து","மை","ப்","பி","த்","த","ன்");

        try {
            Vaarthaigal.substring(v1,4, 9);
            fail();
        } catch (VaarthaiException vaarthaiException) {
            assertEquals(vaarthaiException.getMessage(),"Index out of bound");
        }

        try {
            Vaarthaigal.substring(v1,-1, 2);
            fail();
        } catch (VaarthaiException vaarthaiException) {
            assertEquals(vaarthaiException.getMessage(),"Negative indices found");
        }

    }
}

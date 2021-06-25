package language;

import language.exceptions.VaarthaiException;
import language.models.Vaarthai;
import org.junit.Test;

import static org.junit.Assert.*;

public class VaarthaiTest {
    @Test
    public void shouldAbleToEquateTwoVaarthaigal() {
        Vaarthai v1 = new Vaarthai();
        v1.add("க", "ல்");

        Vaarthai v2 = new Vaarthai();
        v2.add("க", "ல்");

        assertEquals(v1,v2);
    }

    @Test
    public void shouldGetSubstring() throws VaarthaiException {
        Vaarthai v1 = new Vaarthai("பு","து","மை","ப்","பி","த்","த","ன்");
        Vaarthai expected=new Vaarthai("பி","த்","த","ன்");

        Vaarthai actual = v1.substring(4, 8);

        assertEquals(actual,expected);
    }

    @Test
    public void shouldThrowExceptionForIndexErrors() {
        Vaarthai v1 = new Vaarthai("பு","து","மை","ப்","பி","த்","த","ன்");

        try {
            v1.substring(4, 9);
            fail();
        } catch (VaarthaiException vaarthaiException) {
            assertEquals(vaarthaiException.getMessage(),"Index out of bound");
        }

        try {
            v1.substring(-1, 2);
            fail();
        } catch (VaarthaiException vaarthaiException) {
            assertEquals(vaarthaiException.getMessage(),"Negative indices found");
        }

        try {
            v1.substring(3, 2);
            fail();
        } catch (VaarthaiException vaarthaiException) {
            assertEquals(vaarthaiException.getMessage(),"Starting index should be less than endIndex");
        }

    }
}

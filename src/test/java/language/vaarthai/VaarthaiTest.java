package language.vaarthai;

import language.exceptions.VaarthaiException;
import language.models.vaarthai.Vaarthai;
import org.junit.Test;

import static org.junit.Assert.*;

public class VaarthaiTest {
    @Test
    public void shouldAbleToEquateTwoVaarthaigal() {
        Vaarthai v1 = new Vaarthai("க", "ல்");

        Vaarthai v2 = new Vaarthai("க", "ல்");

        assertEquals(v1,v2);
    }


}

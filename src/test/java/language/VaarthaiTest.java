package language;

import language.models.Vaarthai;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VaarthaiTest {
    @Test
    public void shouldAbleToEquateTwoVaarthaigal() {
        Vaarthai v1 = new Vaarthai();
        v1.add("க", "ல்");

        Vaarthai v2 = new Vaarthai();
        v2.add("க", "ல்");

        assertEquals(v1,v2);
    }
}

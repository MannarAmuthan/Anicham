package language;

import language.models.Vaakiyam;
import language.models.vaarthai.Vaarthai;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VaakiyamTest {
    @Test
    public void testAbleToEquateTwoVaakiyam() {

        Vaakiyam one=new Vaakiyam();
        Vaarthai v1 = new Vaarthai("க", "ல்");
        one.add(v1);

        Vaakiyam two=new Vaakiyam();
        Vaarthai v2 = new Vaarthai("க", "ல்");
        two.add(v2);

        assertEquals(one,two);
    }
}

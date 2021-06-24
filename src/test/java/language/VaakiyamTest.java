package language;

import language.models.Vaakiyam;
import language.models.Vaarthai;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VaakiyamTest {
    @Test
    public void testAbleToEquateTwoVaakiyam() {

        Vaakiyam one=new Vaakiyam();
        Vaarthai v1 = new Vaarthai();
        v1.add("க", "ல்");
        one.add(v1);


        Vaakiyam two=new Vaakiyam();
        Vaarthai v2 = new Vaarthai();
        v2.add("க", "ல்");
        two.add(v2);

        assertEquals(one,two);
    }
}

import language.Vaakiyam;
import language.Vaarthai;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProcessorTest {
    @Test

    public void testShouldGetVaakiyam() {
        Vaakiyam expected=new Vaakiyam();
        Vaarthai one = new Vaarthai();
        one.add("கா","ல்");
        Vaarthai two = new Vaarthai();
        two.add("க","ல்");
        Vaarthai three = new Vaarthai();
        three.add("தா","ழ்");
        expected.add(one);
        expected.add(two);
        expected.add(three);

        Vaakiyam actual = Processor.process("கால் கல் தாழ்");

        assert actual.vaarthaigalCount() == 3;
        assertEquals(expected,actual);
    }
}

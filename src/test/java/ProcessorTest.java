import language.models.Vaakiyam;
import language.models.Vaarthai;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProcessorTest {
    @Test

    public void testShouldGetVaakiyam() {
        Vaakiyam expected = new Vaakiyam();
        Vaarthai one = new Vaarthai();
        one.add("க", "ல்");

        Vaarthai two = new Vaarthai();
        two.add("கா", "ல்");

        Vaarthai three = new Vaarthai();
        three.add("க", "ப்", "ப", "லி", "ன்");

        Vaarthai four = new Vaarthai();
        four.add("பீ", "ட", "ம்");

        expected.add(one);
        expected.add(two);
        expected.add(three);
        expected.add(four);

        Processed actual = Processor.process("கல் கால் கப்பலின் பீடம்");

        assert actual.vaakiyam().vaarthaigalCount() == 4;

        assertEquals(expected, actual.vaakiyam);
    }
}

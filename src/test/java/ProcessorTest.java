import language.models.Vaakiyam;
import language.models.Vaarthai;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProcessorTest {

    @Test
    public void testShouldGetVaakiyamForProvidedInput() {
        Vaakiyam expected = new Vaakiyam();
        Vaarthai one = new Vaarthai();
        one.add("க", "ல்");

        Vaarthai two = new Vaarthai();
        two.add("கா", "ல்");

        Vaarthai three = new Vaarthai();
        three.add("க", "ப்", "ப", "லி", "ன்");

        Vaarthai four = new Vaarthai();
        four.add("பீ", "ட", "ம்");

        Vaarthai five = new Vaarthai();
        five.add("பு", "து", "மை", "ப்", "பி", "த்", "த", "ன்");

        Vaarthai six = new Vaarthai();
        six.add("கூ", "கை");

        Vaarthai seven = new Vaarthai();
        seven.add("பெ", "ரி", "யா", "ர்");

        Vaarthai eight = new Vaarthai();
        eight.add("சா", "ன்", "றோ", "ர்");

        Vaarthai nine = new Vaarthai();
        nine.add("பே", "தை", "மை");

        Vaarthai ten = new Vaarthai();
        ten.add("ஒ", "ற்", "று", "மை");

        Vaarthai eleven = new Vaarthai();
        eleven.add("பௌ", "ர்", "ண", "மி");

        Vaarthai twelve = new Vaarthai();
        twelve.add("க","ஃ","றீ","து");


        expected.add(one);
        expected.add(two);
        expected.add(three);
        expected.add(four);
        expected.add(five);
        expected.add(six);
        expected.add(seven);
        expected.add(eight);
        expected.add(nine);
        expected.add(ten);
        expected.add(eleven);
        expected.add(twelve);

        Processed actual = Processor.process("கல் கால் கப்பலின் பீடம் புதுமைப்பித்தன் கூகை பெரியார் சான்றோர் பேதைமை ஒற்றுமை பௌர்ணமி கஃறீது");

        assert actual.vaakiyam().vaarthaigalCount() == 12;

        assertEquals(expected, actual.vaakiyam);
    }

}

import language.models.Vaakiyam;
import language.models.Vaarthai;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProcessorTest {


    @Test
    public void testShouldIdentifyUyirEluthukal() {
        Processed actual = Processor.process("அஆஇஈஉஊஎஏஐஒஓஔஃ");

        assert actual.eluthukkal().length == 13;
    }


    @Test
    public void testShouldIdentifyMeiEluthukal() {
        Processed actual = Processor.process("க்ங்ச்ஞ்ட்ண்த்ந்ப்ம்ய்ர்ல்வ்ழ்ள்ற்ன்");

        assert actual.eluthukkal().length == 18;
    }

    @Test
    public void testShouldIdentifyUyirMeiEluthukal() {
        Processed actual = Processor.process("கஙாசிஞீடுணூதேநைபொமோயௌரௌலௌவூழூளூறைனை");

        assert actual.eluthukkal().length == 18;
    }

    @Test
    public void testShouldGetVaakiyamForProvidedInput() {
        Vaakiyam expected = new Vaakiyam();
        Vaarthai one = new Vaarthai("க", "ல்");
        Vaarthai two = new Vaarthai("கா", "ல்");
        Vaarthai three = new Vaarthai("க", "ப்", "ப", "லி", "ன்");
        Vaarthai four = new Vaarthai("பீ", "ட", "ம்");
        Vaarthai five = new Vaarthai("பு", "து", "மை", "ப்", "பி", "த்", "த", "ன்");
        Vaarthai six = new Vaarthai("கூ", "கை");
        Vaarthai seven = new Vaarthai("பெ", "ரி", "யா", "ர்");
        Vaarthai eight = new Vaarthai("சா", "ன்", "றோ", "ர்");
        Vaarthai nine = new Vaarthai("பே", "தை", "மை");
        Vaarthai ten = new Vaarthai("ஒ", "ற்", "று", "மை");
        Vaarthai eleven = new Vaarthai("பௌ", "ர்", "ண", "மி");
        Vaarthai twelve = new Vaarthai("க","ஃ","றீ","து");


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

        assert actual.vaarthaigal().length == 12;

        assertEquals(expected, actual.vaakiyam);
    }

}

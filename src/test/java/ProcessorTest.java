import language.models.Vaakiyam;
import language.models.sol.Sol;
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
    public void testShouldIdentifyGranthaEluthukkal() {
        Processed actual = Processor.process("ஜிஶிஷாஶ்ரீஹ");

        assert actual.eluthukkal().length == 5;
    }

    @Test
    public void testShouldGetVaakiyamForProvidedInput() {
        Vaakiyam expected = new Vaakiyam();
        Sol one = new Sol("க", "ல்");
        Sol two = new Sol("கா", "ல்");
        Sol three = new Sol("க", "ப்", "ப", "லி", "ன்");
        Sol four = new Sol("பீ", "ட", "ம்");
        Sol five = new Sol("பு", "து", "மை", "ப்", "பி", "த்", "த", "ன்");
        Sol six = new Sol("கூ", "கை");
        Sol seven = new Sol("பெ", "ரி", "யா", "ர்");
        Sol eight = new Sol("சா", "ன்", "றோ", "ர்");
        Sol nine = new Sol("பே", "தை", "மை");
        Sol ten = new Sol("ஒ", "ற்", "று", "மை");
        Sol eleven = new Sol("பௌ", "ர்", "ண", "மி");
        Sol twelve = new Sol("க","ஃ","றீ","து");
        Sol thirteen = new Sol("ஶ்ரீ","ஹ","ரி");


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
        expected.add(thirteen);

        Processed actual = Processor.process("கல் கால் கப்பலின் பீடம் புதுமைப்பித்தன் கூகை பெரியார் சான்றோர் பேதைமை ஒற்றுமை பௌர்ணமி கஃறீது ஶ்ரீஹரி");

        assert actual.vaarthaigal().length == 13;

        assertEquals(expected, actual.vaakiyam);
    }

}

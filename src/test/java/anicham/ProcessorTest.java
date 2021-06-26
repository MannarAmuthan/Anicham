package anicham;

import anicham.language.models.Vaakiyam;
import anicham.language.models.sol.Sol;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProcessorTest {


    @Test
    public void testShouldIdentifyUyirEluthukal() {
        Processed actual = Processor.process("அஆஇஈஉஊஎஏஐஒஓஔஃ");

        assert actual.vaakiyangal().length == 1;
        assert actual.ezhuththukkal().length == 13;
    }


    @Test
    public void testShouldIdentifyMeiEluthukal() {
        Processed actual = Processor.process("க்ங்ச்ஞ்ட்ண்த்ந்ப்ம்ய்ர்ல்வ்ழ்ள்ற்ன்");

        assert actual.vaakiyangal().length == 1;
        assert actual.ezhuththukkal().length == 18;
    }

    @Test
    public void testShouldIdentifyUyirMeiEluthukal() {
        Processed actual = Processor.process("கஙாசிஞீடுணூதேநைபொமோயௌரௌலௌவூழூளூறைனை");

        assert actual.vaakiyangal().length == 1;
        assert actual.ezhuththukkal().length == 18;
    }

    @Test
    public void testShouldIdentifyGranthaEluthukkal() {
        Processed actual = Processor.process("ஜிஶிஷாஶ்ரீஹ");

        assert actual.vaakiyangal().length == 1;
        assert actual.ezhuththukkal().length == 5;
    }

    @Test
    public void testShouldGetVaakiyamForProvidedInput() {
        Vaakiyam expected = new Vaakiyam();
        Sol one = Processor.sol("கல்");
        Sol two = Processor.sol("கால்");
        Sol three = Processor.sol("கப்பலின்");
        Sol four = Processor.sol("பீடம்");
        Sol five = Processor.sol("புதுமைப்பித்தன்");
        Sol six = Processor.sol("கூகை");
        Sol seven = Processor.sol("பெரியார்");
        Sol eight = Processor.sol("சான்றோர்");
        Sol nine = Processor.sol("பேதைமை");
        Sol ten = Processor.sol("ஒற்றுமை");
        Sol eleven = Processor.sol("பௌர்ணமி");
        Sol twelve = Processor.sol("கஃறீது");
        Sol thirteen = Processor.sol("ஶ்ரீஹரி");

        expected.add(one,two,three,four,five,six,seven,eight,nine,ten,eleven,twelve,thirteen);

        Processed actual = Processor.process("கல் கால் கப்பலின் பீடம் புதுமைப்பித்தன் கூகை பெரியார் சான்றோர் பேதைமை ஒற்றுமை பௌர்ணமி கஃறீது ஶ்ரீஹரி");


        assert actual.vaakiyangal().length == 1;
        assert actual.sorkkal().length == 13;

        assertEquals(expected, actual.getPatthigal()[0].getVaakiyangal().get(0));
    }

    @Test
    public void shouldIdentifySeparationBetweenSorkkal(){
        Vaakiyam expected = new Vaakiyam();
        Sol one = Processor.sol("கல்");
        Sol two = Processor.sol("கால்");
        Sol three = Processor.sol("கப்பலின்");
        Sol four = Processor.sol("பீடம்");
        Sol five = Processor.sol("புதுமைப்பித்தன்");
        Sol six = Processor.sol("கூகை");
        Sol seven = Processor.sol("பெரியார்");
        Sol eight = Processor.sol("சான்றோர்");
        Sol nine = Processor.sol("பேதைமை");
        expected.add(one,two,three,four,five,six,seven,eight,nine);

        Processed actual = Processor.process("கல்,கால்,கப்பலின், பீடம் புதுமைப்பித்தன் கூகை,பெரியார் சான்றோர் ,பேதைமை.");

        assert actual.sorkkal().length == 9;

        assertEquals(expected, actual.getPatthigal()[0].getVaakiyangal().get(0));
    }

    @Test
    public void shouldIgnoreSpecialCharacters() {
        Vaakiyam expected = new Vaakiyam();
        Sol one = Processor.sol("கல்");
        Sol two = Processor.sol("கால்");
        Sol three = Processor.sol("கப்பலின்");
        expected.add(one,two,three);

        Processed actual = Processor.process("கல்!?,`கால்`-,\"கப்பலின்\"'");

        assert actual.sorkkal().length == 3;

        assertEquals(expected, actual.getPatthigal()[0].getVaakiyangal().get(0));
    }

    @Test
    public void shouldProvidePatthiForGivenInput() {

        Processed actual = Processor.process("கர்நாடக மாநிலத்தில் உள்ள சிர்ஷி என்ற ஊரில் இருந்து சுமார் கிலோ மீட்டர் பயணம் செய்தால், சால்மலா ஆறு வந்துவிடும்.வற்றாமல் ஓடும் இந்த ஆற்றின் நீரை நம்பி அங்கு பல்லாயிரம் மக்கள் வாழ்கின்றனர்.மேற்குத் தொடர்ச்சி மலைப் பகுதியான இங்கு தென்மேற்கு பருவமழையின் போது வெள்ளம் கரைபுரண்டு ஓடும்.\n" +
                "இங்கு உள்ள லிங்கத்திற்கு அபிஷேக ஆராதனை எதுவும் செய்யப்படுவதில்லை.ஓடும் ஆற்றின் ஆற்றின் நீரினால் லிங்கத்திற்கு தினம் தினம் அபிஷேகம்.ஆண்டுதோறும் மகா சிவராத்திரியின் போது மக்கள் கூட்டம் இங்கு அலைமோதும்.இறைவன் எங்கும் இருக்கின்றான் என்பதை இது நமக்கு உணர்த்துகிறது.");


        assert actual.getPatthigal().length == 2;
        assert actual.getPatthigal()[0].getVaakiyangal().size() == 3;
        assert actual.getPatthigal()[1].getVaakiyangal().size() == 4;
    }
}

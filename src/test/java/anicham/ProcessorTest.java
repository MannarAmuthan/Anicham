package anicham;

import anicham.language.models.Vaakiyam;
import anicham.language.models.sol.Sol;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProcessorTest {


    @Test
    public void testShouldIdentifyUyirEluthukal() {
        Processed actual = Processor.process("அஆஇஈஉஊஎஏஐஒஓஔஃ");

        assert actual.ezhuththukkal().length == 13;
    }


    @Test
    public void testShouldIdentifyMeiEluthukal() {
        Processed actual = Processor.process("க்ங்ச்ஞ்ட்ண்த்ந்ப்ம்ய்ர்ல்வ்ழ்ள்ற்ன்");

        assert actual.ezhuththukkal().length == 18;
    }

    @Test
    public void testShouldIdentifyUyirMeiEluthukal() {
        Processed actual = Processor.process("கஙாசிஞீடுணூதேநைபொமோயௌரௌலௌவூழூளூறைனை");

        assert actual.ezhuththukkal().length == 18;
    }

    @Test
    public void testShouldIdentifyGranthaEluthukkal() {
        Processed actual = Processor.process("ஜிஶிஷாஶ்ரீஹ");

        assert actual.ezhuththukkal().length == 5;
    }

    @Test
    public void testShouldGetVaakiyamForProvidedInput() {
        Vaakiyam expected = new Vaakiyam();
        Sol one = Processor.process("கல்").sorkkal()[0];
        Sol two = Processor.process("கால்").sorkkal()[0];
        Sol three = Processor.process("கப்பலின்").sorkkal()[0];
        Sol four = Processor.process("பீடம்").sorkkal()[0];
        Sol five = Processor.process("புதுமைப்பித்தன்").sorkkal()[0];
        Sol six = Processor.process("கூகை").sorkkal()[0];
        Sol seven = Processor.process("பெரியார்").sorkkal()[0];
        Sol eight = Processor.process("சான்றோர்").sorkkal()[0];
        Sol nine = Processor.process("பேதைமை").sorkkal()[0];
        Sol ten = Processor.process("ஒற்றுமை").sorkkal()[0];
        Sol eleven = Processor.process("பௌர்ணமி").sorkkal()[0];
        Sol twelve = Processor.process("கஃறீது").sorkkal()[0];
        Sol thirteen = Processor.process("ஶ்ரீஹரி").sorkkal()[0];

        expected.add(one,two,three,four,five,six,seven,eight,nine,ten,eleven,twelve,thirteen);

        Processed actual = Processor.process("கல் கால் கப்பலின் பீடம் புதுமைப்பித்தன் கூகை பெரியார் சான்றோர் பேதைமை ஒற்றுமை பௌர்ணமி கஃறீது ஶ்ரீஹரி");

        assert actual.sorkkal().length == 13;

        assertEquals(expected, actual.getPatthigal().get(0).getVaakiyangal().get(0));
    }

    @Test
    public void shouldIdentifySeparationBetweenSorkkal(){
        Vaakiyam expected = new Vaakiyam();
        Sol one = Processor.process("கல்").sorkkal()[0];
        Sol two = Processor.process("கால்").sorkkal()[0];
        Sol three = Processor.process("கப்பலின்").sorkkal()[0];
        Sol four = Processor.process("பீடம்").sorkkal()[0];
        Sol five = Processor.process("புதுமைப்பித்தன்").sorkkal()[0];
        Sol six = Processor.process("கூகை").sorkkal()[0];
        Sol seven = Processor.process("பெரியார்").sorkkal()[0];
        Sol eight = Processor.process("சான்றோர்").sorkkal()[0];
        Sol nine = Processor.process("பேதைமை").sorkkal()[0];
        expected.add(one,two,three,four,five,six,seven,eight,nine);

        Processed actual = Processor.process("கல்,கால்,கப்பலின், பீடம் புதுமைப்பித்தன் கூகை,பெரியார் சான்றோர் ,பேதைமை.");

        assert actual.sorkkal().length == 9;

        assertEquals(expected, actual.getPatthigal().get(0).getVaakiyangal().get(0));
    }

    @Test
    public void shouldIgnoreSpecialCharacters() {
        Vaakiyam expected = new Vaakiyam();
        Sol one = Processor.process("கல்").sorkkal()[0];
        Sol two = Processor.process("கால்").sorkkal()[0];
        Sol three = Processor.process("கப்பலின்").sorkkal()[0];
        expected.add(one,two,three);

        Processed actual = Processor.process("கல்!?,`கால்`-,\"கப்பலின்\"'");

        assert actual.sorkkal().length == 3;

        assertEquals(expected, actual.getPatthigal().get(0).getVaakiyangal().get(0));
    }

    @Test
    public void shouldProvidePatthiForGivenInput() {

        Processed actual = Processor.process("கர்நாடக மாநிலத்தில் உள்ள சிர்ஷி என்ற ஊரில் இருந்து சுமார் கிலோ மீட்டர் பயணம் செய்தால், சால்மலா ஆறு வந்துவிடும்.வற்றாமல் ஓடும் இந்த ஆற்றின் நீரை நம்பி அங்கு பல்லாயிரம் மக்கள் வாழ்கின்றனர்.மேற்குத் தொடர்ச்சி மலைப் பகுதியான இங்கு தென்மேற்கு பருவமழையின் போது வெள்ளம் கரைபுரண்டு ஓடும்.\n" +
                "இங்கு உள்ள லிங்கத்திற்கு அபிஷேக ஆராதனை எதுவும் செய்யப்படுவதில்லை.ஓடும் ஆற்றின் ஆற்றின் நீரினால் லிங்கத்திற்கு தினம் தினம் அபிஷேகம்.ஆண்டுதோறும் மகா சிவராத்திரியின் போது மக்கள் கூட்டம் இங்கு அலைமோதும்.இறைவன் எங்கும் இருக்கின்றான் என்பதை இது நமக்கு உணர்த்துகிறது.");


        assert actual.getPatthigal().size() == 2;
        assert actual.getPatthigal().get(0).getVaakiyangal().size() == 3;
        assert actual.getPatthigal().get(1).getVaakiyangal().size() == 4;
    }
}

package anicham;

import anicham.language.models.Patthi;
import anicham.language.models.Vaakiyam;
import anicham.language.models.sol.Sol;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AnichamTest {


    @Test
    public void testShouldIdentifyUyirEluthukal() {
        Processed actual = Anicham.process("அஆஇஈஉஊஎஏஐஒஓஔஃ");

        assert actual.vaakiyangal().length == 1;
        assert actual.ezhuththukkal().length == 13;
    }


    @Test
    public void testShouldIdentifyMeiEluthukal() {
        Processed actual = Anicham.process("க்ங்ச்ஞ்ட்ண்த்ந்ப்ம்ய்ர்ல்வ்ழ்ள்ற்ன்");

        assert actual.vaakiyangal().length == 1;
        assert actual.ezhuththukkal().length == 18;
    }

    @Test
    public void testShouldIdentifyUyirMeiEluthukal() {
        Processed actual = Anicham.process("கஙாசிஞீடுணூதேநைபொமோயௌரௌலௌவூழூளூறைனை");

        assert actual.vaakiyangal().length == 1;
        assert actual.ezhuththukkal().length == 18;
    }

    @Test
    public void testShouldIdentifyGranthaEluthukkal() {
        Processed actual = Anicham.process("ஜிஶிஷாஶ்ரீஹஷே");

        assert actual.vaakiyangal().length == 1;
        assert actual.ezhuththukkal().length == 6;
    }

    @Test
    public void testShouldGetVaakiyamForProvidedInput() {
        Vaakiyam expected = new Vaakiyam();
        Sol one = Anicham.sol("கல்");
        Sol two = Anicham.sol("கால்");
        Sol three = Anicham.sol("கப்பலின்");
        Sol four = Anicham.sol("பீடம்");
        Sol five = Anicham.sol("புதுமைப்பித்தன்");
        Sol six = Anicham.sol("கூகை");
        Sol seven = Anicham.sol("பெரியார்");
        Sol eight = Anicham.sol("சான்றோர்");
        Sol nine = Anicham.sol("பேதைமை");
        Sol ten = Anicham.sol("ஒற்றுமை");
        Sol eleven = Anicham.sol("பௌர்ணமி");
        Sol twelve = Anicham.sol("கஃறீது");
        Sol thirteen = Anicham.sol("ஶ்ரீஹரி");

        expected.add(one,two,three,four,five,six,seven,eight,nine,ten,eleven,twelve,thirteen);

        Vaakiyam actual = Anicham.vaakiyam("கல் கால் கப்பலின் பீடம் புதுமைப்பித்தன் கூகை பெரியார் சான்றோர் பேதைமை ஒற்றுமை பௌர்ணமி கஃறீது ஶ்ரீஹரி");


        assert actual.sorkkalCount() == 13;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIdentifySeparationBetweenSorkkal(){
        Vaakiyam expected = new Vaakiyam();
        Sol one = Anicham.sol("கல்");
        Sol two = Anicham.sol("கால்");
        Sol three = Anicham.sol("கப்பலின்");
        Sol four = Anicham.sol("பீடம்");
        Sol five = Anicham.sol("புதுமைப்பித்தன்");
        Sol six = Anicham.sol("கூகை");
        Sol seven = Anicham.sol("பெரியார்");
        Sol eight = Anicham.sol("சான்றோர்");
        Sol nine = Anicham.sol("பேதைமை");
        expected.add(one,two,three,four,five,six,seven,eight,nine);

        Vaakiyam actual = Anicham.vaakiyam("கல்,கால்,கப்பலின், பீடம் புதுமைப்பித்தன் கூகை,பெரியார் சான்றோர் ,பேதைமை.");

        assert actual.sorkkalCount()== 9;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIgnoreSpecialCharacters() {
        Vaakiyam expected = new Vaakiyam();
        Sol one = Anicham.sol("கல்");
        Sol two = Anicham.sol("கால்");
        Sol three = Anicham.sol("கப்பலின்");
        expected.add(one,two,three);

        Processed actual = Anicham.process("கல்!?,`கால்`-,\"கப்பலின்\"'");

        assert actual.sorkkal().length == 3;

        assertEquals(expected, actual.getPatthigal()[0].getVaakiyangal().get(0));
    }

    @Test
    public void shouldProvidePatthiForGivenInput() {

        Processed actual = Anicham.process("கர்நாடக மாநிலத்தில் உள்ள சிர்ஷி என்ற ஊரில் இருந்து சுமார் கிலோ மீட்டர் பயணம் செய்தால், சால்மலா ஆறு வந்துவிடும். வற்றாமல் ஓடும் இந்த ஆற்றின் நீரை நம்பி அங்கு பல்லாயிரம் மக்கள் வாழ்கின்றனர். மேற்குத் தொடர்ச்சி மலைப் பகுதியான இங்கு தென்மேற்கு பருவமழையின் போது வெள்ளம் கரைபுரண்டு ஓடும்.\n" +
                "இங்கு உள்ள லிங்கத்திற்கு அபிஷேக ஆராதனை எதுவும் செய்யப்படுவதில்லை. ஓடும் ஆற்றின் ஆற்றின் நீரினால் லிங்கத்திற்கு தினம் தினம் அபிஷேகம். ஆண்டுதோறும் மகா சிவராத்திரியின் போது மக்கள் கூட்டம் இங்கு அலைமோதும். இறைவன் எங்கும் இருக்கின்றான் என்பதை இது நமக்கு உணர்த்துகிறது.");


        assert actual.getPatthigal().length == 2;
        assert actual.getPatthigal()[0].getVaakiyangal().size() == 3;
        assert actual.getPatthigal()[1].getVaakiyangal().size() == 4;



        List<Patthi> actual2 = Anicham.patthigal("விடுதலை இந்தியாவின் முதல் சட்ட அமைச்சராகவும், இந்திய அரசியல் சாசனத்தின் தந்தையாக விளங்கியவர்,‘பீம்ராவ் ராம்ஜி அம்பேத்கர்’. இவர் ஒரு சமூக சீர்திருத்தவாதியாக மட்டுமல்லாமல், மிகச்சிறந்த பொருளியல் அறிஞராகவும், அரசியல் தத்துவமேதையாகவும், சமூக சீர்திருத்தவாதியாகவும், பகுத்தறிவு சிந்தனையாளராகவும், சிறந்த எழுத்தாளர் மற்றும் பேச்சாளராகவும், வரலாற்று ஆசானாகவும் விளங்கியவர்.\n" +
                "தலித் இன மக்களுக்கு மட்டுமல்லாமல், ஒடுக்கப்பட்ட மக்களின் வாழ்விருளைப் போக்க, உதித்த சூரியன்.\n" +
                "மகாத்மா காந்திக்கு பிறகு, சுதந்திர இந்தியாவின் மாபெரும் தலைவர் என்று போற்றப்பட்டவர், டாக்டர் அம்பேத்கர் அவர்கள். தன் வாழ்நாள் முழுவதையும் சமூகத்திற்கென அர்ப்பணித்த மாபெரும் சிற்பியான டாக்டர் அம்பேத்கர் அவர்களின் வாழ்க்கை வரலாறு மற்றும் சாதனைகளை காண்போம்.");


        assert actual2.size() == 3;
        assert actual2.get(0).getVaakiyangal().size() == 2;
        assert actual2.get(1).getVaakiyangal().size() == 1;
        assert actual2.get(2).getVaakiyangal().size() == 2;

    }
}

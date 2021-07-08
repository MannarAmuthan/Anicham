package anicham;

import anicham.ilakkanam.models.Adi;
import anicham.ilakkanam.models.Asai;
import anicham.ilakkanam.models.Oasai;
import anicham.ilakkanam.models.Venba;
import anicham.ilakkanam.models.seer.EerasaiSeer;
import anicham.ilakkanam.models.seer.EetruSeer;
import anicham.ilakkanam.models.seer.MoovasaiSeer;
import anicham.ilakkanam.models.seer.Seer;
import anicham.ilakkanam.types.AdiType;
import anicham.language.models.Patthi;
import anicham.language.models.Vaakiyam;
import anicham.language.models.sol.Sol;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AnichamTest {


    @Test
    public void testShouldIdentifyUyirEluthukal() {
        Processed actual = Anicham.processTamizhString("அஆஇஈஉஊஎஏஐஒஓஔஃ");

        assert actual.vaakiyangal().length == 1;
        assert actual.ezhuththukkal().length == 13;
    }


    @Test
    public void testShouldIdentifyMeiEluthukal() {
        Processed actual = Anicham.processTamizhString("க்ங்ச்ஞ்ட்ண்த்ந்ப்ம்ய்ர்ல்வ்ழ்ள்ற்ன்");

        assert actual.vaakiyangal().length == 1;
        assert actual.ezhuththukkal().length == 18;
    }

    @Test
    public void testShouldIdentifyUyirMeiEluthukal() {
        Processed actual = Anicham.processTamizhString("கஙாசிஞீடுணூதேநைபொமோயௌரௌலௌவூழூளூறைனை");

        assert actual.vaakiyangal().length == 1;
        assert actual.ezhuththukkal().length == 18;
    }

    @Test
    public void testShouldIdentifyGranthaEluthukkal() {
        Processed actual = Anicham.processTamizhString("ஜிஶிஷாஶ்ரீஹஷே");

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

        Processed actual = Anicham.processTamizhString("கல்!?,`கால்`-,\"கப்பலின்\"'");

        assert actual.sorkkal().length == 3;

        assertEquals(expected, actual.getPatthigal()[0].getVaakiyangal().get(0));
    }

    @Test
    public void shouldProvidePatthiForGivenInput() {

        Processed actual = Anicham.processTamizhString("கர்நாடக மாநிலத்தில் உள்ள சிர்ஷி என்ற ஊரில் இருந்து சுமார் கிலோ மீட்டர் பயணம் செய்தால், சால்மலா ஆறு வந்துவிடும். வற்றாமல் ஓடும் இந்த ஆற்றின் நீரை நம்பி அங்கு பல்லாயிரம் மக்கள் வாழ்கின்றனர். மேற்குத் தொடர்ச்சி மலைப் பகுதியான இங்கு தென்மேற்கு பருவமழையின் போது வெள்ளம் கரைபுரண்டு ஓடும்.\n" +
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

    @Test
    public void shouldGetOasaiFromGivenInput() {
        String inputOne="த";
        String inputTwo="டா";
        String inputThree="ர்";

        Oasai actualOne=Anicham.oasai(inputOne);
        Oasai actualTwo=Anicham.oasai(inputTwo);
        Oasai actualThree=Anicham.oasai(inputThree);

        assertEquals(Oasai.KURIL,actualOne);
        assertEquals(Oasai.NEDIL,actualTwo);
        assertEquals(Oasai.OTRU,actualThree);

        Oasai oasai=Anicham.oasai("ர்");
        System.out.println(oasai); //Prints OTRU
    }

    @Test
    public void shouldGetAsaiFromGivenInput() {
        String inputOne= "தன்";
        String inputTwo= "தான்";
        String inputThree= "அடா";
        String inputFour= "தொழார்";

        Asai expectedOne=Asai.getNerAsai(Oasai.KURIL, Oasai.OTRU);
        Asai expectedTwo=Asai.getNerAsai(Oasai.NEDIL, Oasai.OTRU);
        Asai expectedThree=Asai.getNiraiAsai(Oasai.KURIL, Oasai.NEDIL);
        Asai expectedFour=Asai.getNiraiAsai(Oasai.KURIL, Oasai.NEDIL, Oasai.OTRU);

        Asai actualOne=Anicham.asai(inputOne);
        Asai actualTwo=Anicham.asai(inputTwo);
        Asai actualThree=Anicham.asai(inputThree);
        Asai actualFour=Anicham.asai(inputFour);

        assertEquals(expectedOne,actualOne);
        assertEquals(expectedTwo,actualTwo);
        assertEquals(expectedThree,actualThree);
        assertEquals(expectedFour,actualFour);
    }

    @Test
    public void shouldGetSeerFromGivenInput() {
        String inputOne="ஊடுதல்";
        String inputTwo="இடுக்கண்";
        String inputThree="ஆங்கே";
        String inputFour="களைவதாம்";

        Seer expectedOne=EerasaiSeer.getKoovilam(Asai.getNerAsai(Oasai.NEDIL),Asai.getNiraiAsai(Oasai.KURIL, Oasai.KURIL, Oasai.OTRU));
        Seer expectedTwo=EerasaiSeer.getPulima(Asai.getNiraiAsai(Oasai.KURIL, Oasai.KURIL, Oasai.OTRU),Asai.getNerAsai(Oasai.KURIL, Oasai.OTRU));
        Seer expectedThree=EerasaiSeer.getThema(Asai.getNerAsai(Oasai.NEDIL, Oasai.OTRU),Asai.getNerAsai(Oasai.NEDIL));
        Seer expectedFour=EerasaiSeer.getKaruvilam(Asai.getNiraiAsai(Oasai.KURIL, Oasai.NEDIL),Asai.getNiraiAsai(Oasai.KURIL, Oasai.NEDIL, Oasai.OTRU));

        Seer actualOne=Anicham.seer(inputOne);
        Seer actualTwo=Anicham.seer(inputTwo);
        Seer actualThree=Anicham.seer(inputThree);
        Seer actualFour=Anicham.seer(inputFour);

        assertEquals(expectedOne,actualOne);
        assertEquals(expectedTwo,actualTwo);
        assertEquals(expectedThree,actualThree);
        assertEquals(expectedFour,actualFour);
    }

    @Test
    public void shouldGetAdiFromGivenInput(){
       String inputOne="பாலும் தெளிதேனும் பாகும் பருப்புமிவை";
       String expectedOne="THEMA PULIMANGAI THEMA KARUVILANGAI";

       String inputTwo="சங்கத் தமிழ்மூன்றுந் தா";
       String expectedTwo="THEMA PULIMANGAI NAAL";

       Adi actualOne=Anicham.adi(inputOne);
       Adi actualTwo=Anicham.adi(inputTwo);


       assertEquals(expectedOne,actualOne.toString());
       assertEquals(expectedTwo,actualTwo.toString());

       assertEquals(AdiType.ADI,actualOne.getType());
       assertEquals(AdiType.EETRADI,actualTwo.getType());
    }

    @Test
    public void shouldGetVenbaForGivenInput() {
        String thirukkural="அகர முதல எழுத்தெல்லாம் ஆதி\n"+"பகவன் முதற்றே உலகு";

        EerasaiSeer seerOne=EerasaiSeer.getPulima(Asai.getNiraiAsai(Oasai.KURIL, Oasai.KURIL),Asai.getNerAsai(Oasai.KURIL));
        EerasaiSeer seerTwo=EerasaiSeer.getPulima(Asai.getNiraiAsai(Oasai.KURIL, Oasai.KURIL),Asai.getNerAsai(Oasai.KURIL));
        MoovasaiSeer seerThree=MoovasaiSeer.getPulimangai(Asai.getNiraiAsai(Oasai.KURIL, Oasai.KURIL, Oasai.OTRU),
                Asai.getNerAsai(Oasai.KURIL, Oasai.OTRU),Asai.getNerAsai(Oasai.NEDIL, Oasai.OTRU));
        EerasaiSeer seerFour=EerasaiSeer.getThema(Asai.getNerAsai(Oasai.NEDIL),Asai.getNerAsai(Oasai.KURIL));

        EerasaiSeer seerFive=EerasaiSeer.getPulima(Asai.getNiraiAsai(Oasai.KURIL, Oasai.KURIL),Asai.getNerAsai(Oasai.KURIL, Oasai.OTRU));
        EerasaiSeer seerSix=EerasaiSeer.getPulima(Asai.getNiraiAsai(Oasai.KURIL, Oasai.KURIL, Oasai.OTRU),Asai.getNerAsai(Oasai.NEDIL));
        EetruSeer seerSeven=EetruSeer.getPirappu(Asai.getNiraiAsai(Oasai.KURIL, Oasai.KURIL),Asai.getNerAsai(Oasai.KURIL));


        Adi adiOne=Adi.getAdi(new Seer[]{seerOne,seerTwo,seerThree,seerFour});
        Adi adiTwo=Adi.getEetraAdi(new Seer[]{seerFive,seerSix,seerSeven});

        Venba expected=new Venba(new Adi[]{adiOne},adiTwo);

        Venba venba = Anicham.venba(thirukkural);

        assertEquals(expected,venba);
    }

    @Test
    public void shouldGetStringRepresentationOfVenba() {
        String thirukkural="ஒழுக்கத்தின் எய்துவர் மேன்மை இழுக்கத்தின்\n" +"எய்துவர் எய்தாப் பழி.";

        String expected="PULIMANGAI KOOVILAM THEMA PULIMANGAI\n"+"KOOVILAM THEMA MALAR";


        Venba venba = Anicham.venba(thirukkural);

        assertEquals(expected,venba.toString());

        String thirukkuralTwo="உடுக்கை இழந்தவன் கைபோல ஆங்கே\n" +"இடுக்கண் களைவதாம் நட்பு.";

        String expectedTwo="PULIMA KARUVILAM THEMANGAI THEMA\n"+ "PULIMA KARUVILAM KAASU";

        assertEquals(expectedTwo,Anicham.venba(thirukkuralTwo).toString());
    }
}

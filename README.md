# **அனிச்சம்(Anicham)**
![build](https://github.com/MannarAmuthan/Anicham/actions/workflows/main.yml/badge.svg)
![](https://byob.yarr.is/RubbaBoy/main/github)

Tamizh language parser to parse tamizh texts of UTF-8 encoded. Provides functions for identify and manipulate tamizh strings. Structured by hierchical elements of Tamizh native grammar rules (Ezhuthu, Sol, Vaakiyam). 

## Contents

[Core Elements](#core-elements)
- [எழுத்து](#ezhuththu)
- [சொல்](#sol)
- [வாக்கியம்](#vaakiyam)
- [பத்தி](#patthi)

[Grammatical Tools](#grammatical-tools)
- [யாப்பு](#yappu)
    - [எழுத்து(ஓசை)](#ezhuththu-oasai)
    - [அசை](#asai)
    - [சீர்](#seer)
    - [அடி](#adi)
    - [வெண்பா](#venba)

[More Utils](#more-utils)
- [Sol Utils](#sol-utils)

[Features to be implemented or Limitations](#features-to-be-implemented-or-limitations)


## **Core elements:**

##### <a id="ezhuththu">எழுத்து(Ezhuththu) - _A Letter_:</a>

A Letter , final smallest entity of all components in a language.
    
Usage:
```java       
        Ezhuththu a=Anicham.ezhuththu("அ");
        Ezhuththu thea=Anicham.ezhuththu("தே");

        System.out.println(a.toString()); //Prints : அ
        System.out.println(a.getEzhuththuType()); //Prints : UYIR

        System.out.println(thea.toString()); //Prints : தே
        System.out.println(thea.getEzhuththuType()); //Prints : UYIR_MEI
```

##### <a id="sol">சொல்(Sol) - _A word_:</a>

A word , group of letters(ezhuththukal) create Sol.

Usage:
```java       
        Sol sol=Anicham.sol("அறத்துப்பால்");

        System.out.println(sol.ezhutthuCount()); // Prints 7

        // To get ezhuththukkal from sol
        List<Ezhuththu> ezhutthukkal = sol.ezhutthukkal();
```


##### <a id="vaakiyam">வாக்கியம்(Vaakiyam) - _A Sentence_:</a>

A sentence , group of words(sorkkal) creates Vaakiyangal.

Usage:
```java       
         Vaakiyam vaakiyam = Anicham.vaakiyam("கல் கால் கப்பலின் பீடம் புதுமைப்பித்தன் கூகை பெரியார் சான்றோர் பேதைமை ஒற்றுமை பௌர்ணமி கஃறீது ஶ்ரீஹரி");
         
         System.out.println(vaakiyam.sorkkalCount()); //Prints 13

         // To get Sorkkal from Vaakiyam
         List<Sol> sorkkal = vaakiyam.sorkkal();   
```


##### <a id="patthi">பத்தி(Patthi) - _A Paragraph_:</a>

A Paragraph , group of sentences(patthigal) creates Patthi.

Usage:
``` java       
        List<Patthi> patthigal = Anicham.patthigal("விடுதலை இந்தியாவின் முதல் சட்ட அமைச்சராகவும், இந்திய அரசியல் சாசனத்தின் தந்தையாக விளங்கியவர்,‘பீம்ராவ் ராம்ஜி அம்பேத்கர்’. இவர் ஒரு சமூக சீர்திருத்தவாதியாக மட்டுமல்லாமல், மிகச்சிறந்த பொருளியல் அறிஞராகவும், அரசியல் தத்துவமேதையாகவும், சமூக சீர்திருத்தவாதியாகவும், பகுத்தறிவு சிந்தனையாளராகவும், சிறந்த எழுத்தாளர் மற்றும் பேச்சாளராகவும், வரலாற்று ஆசானாகவும் விளங்கியவர்.\n" +
                "தலித் இன மக்களுக்கு மட்டுமல்லாமல், ஒடுக்கப்பட்ட மக்களின் வாழ்விருளைப் போக்க, உதித்த சூரியன்.\n" +
                "மகாத்மா காந்திக்கு பிறகு, சுதந்திர இந்தியாவின் மாபெரும் தலைவர் என்று போற்றப்பட்டவர், டாக்டர் அம்பேத்கர் அவர்கள். தன் வாழ்நாள் முழுவதையும் சமூகத்திற்கென அர்ப்பணித்த மாபெரும் சிற்பியான டாக்டர் அம்பேத்கர் அவர்களின் வாழ்க்கை வரலாறு மற்றும் சாதனைகளை காண்போம்.");


        System.out.println(patthigal.size()); // Prints 3 (3 Patthigal)

        // To get vaakiyangal of First patthi from given input
        LinkedList<Vaakiyam> vaakiyangal = patthigal.get(0).getVaakiyangal();
```
## **Grammatical Tools:**
### <a id="yappu">யாப்பு(Yappu)</a>

Yappu literally means compilation grammar. It defines semanticity of sound,letter,word,stanza in Tamil poems. 
See more [here](https://ta.wikipedia.org/wiki/%E0%AE%AF%E0%AE%BE%E0%AE%AA%E0%AF%8D%E0%AE%AA%E0%AE%BF%E0%AE%B2%E0%AE%95%E0%AF%8D%E0%AE%95%E0%AE%A3%E0%AE%AE%E0%AF%8D)

##### <a id="ezhuththu-oasai">எழுத்து(ஓசை)(Oasai)</a>
As we see earlier, Ezhuththu is first entity, in yappu , it represents phonetic length form. From the perspective of Phonetics , Tamizh letters catagorized into 3 types.
Kuril, Nedil, Otru (குறில்,நெடில்,ஒற்று).

Usage:
```java
        Oasai oasai=Anicham.oasai("த");
        System.out.println(oasai); //Prints KURIL
```
```java
        Oasai oasai=Anicham.oasai("டா");
        System.out.println(oasai); //Prints NEDIL
```
```java
        Oasai oasai=Anicham.oasai("ர்");
        System.out.println(oasai); //Prints OTRU
```


##### <a id="asai">அசை(Asai)</a>
Based on Phonetics of letter (Ezhuththu), Asai(sub-part of Word) , is catagorized into 2 types.
Ner,Nirai (நேர்,நிரை). See the grammar file for more info.

Usage:
```java
        Asai asai=Anicham.asai("தன்");
        System.out.println(asai.getType()); //Prints NER
```
```java
        Asai asai=Anicham.asai("தொழார்");
        System.out.println(asai.getType()); //Prints NIRAI
```

##### <a id="seer">சீர்(Seer)</a>
Based on arrangement of Asai, Tamizh word which is Seer (in Yaapilakkam terminology), is catagorized into 14 types.
First two types contains 1 asai , mostly comes at last point of poetry(called eetru-seer).
Next 4 types contains 2 asai inside, so They are called Eerasai Seer (2 Asai Seer).
and last 8 types contains 3 asai inside so,  They are called Moovasai Seer (3 Asai Seer). 
Read about all types [here](https://ta.wikipedia.org/wiki/%E0%AE%9A%E0%AF%80%E0%AE%B0%E0%AF%8D_(%E0%AE%AF%E0%AE%BE%E0%AE%AA%E0%AF%8D%E0%AE%AA%E0%AE%BF%E0%AE%B2%E0%AE%95%E0%AF%8D%E0%AE%95%E0%AE%A3%E0%AE%AE%E0%AF%8D)#%E0%AE%9A%E0%AF%80%E0%AE%B0%E0%AF%8D_%E0%AE%B5%E0%AE%95%E0%AF%88%E0%AE%95%E0%AE%B3%E0%AF%8D)

Usage:
```java
        Seer seer=Anicham.seer("ஊடுதல்");
        System.out.println(seer.getType()); //Prints KOOVILAM
```
```java
        Seer seer=Anicham.seer("ஒழுக்கத்தின்");
        System.out.println(seer.getType()); //Prints THEMANGAI
```

##### <a id="adi">அடி(Adi)</a>
Basically it means line of poem. Adi contains 4 seer. 
Last line of the poem is called "Eetradi", which contains 3 seer. Last seer is known as eetru-seer.
Read more [here](https://ta.wikipedia.org/wiki/%E0%AE%85%E0%AE%9F%E0%AE%BF_(%E0%AE%AF%E0%AE%BE%E0%AE%AA%E0%AF%8D%E0%AE%AA%E0%AE%BF%E0%AE%B2%E0%AE%95%E0%AF%8D%E0%AE%95%E0%AE%A3%E0%AE%AE%E0%AF%8D,_%E0%AE%9A%E0%AF%80%E0%AE%B0%E0%AF%8D_%E0%AE%8E%E0%AE%A3%E0%AF%8D%E0%AE%A3%E0%AE%BF%E0%AE%95%E0%AF%8D%E0%AE%95%E0%AF%88)).

Usage:
```java
        Adi adi=Anicham.adi("பாலும் தெளிதேனும் பாகும் பருப்புமிவை");
        System.out.println(adi.getType()); //Prints ADI
        System.out.println(adi.toString()); //Prints THEMA PULIMANGAI THEMA KARUVILANGAI
```
```java
        Adi adi=Anicham.adi("சங்கத் தமிழ்மூன்றுந் தா");
        System.out.println(adi.getType()); //Prints EETRADI
        System.out.println(adi.toString()); //Prints THEMA PULIMANGAI NAAL
```

##### <a id="venba">வெண்பா(Venba)</a>
Venba is a form of classical Tamil poetry. Which is the root of all above elements, and define their rules. 
You can provide Venba poems as input , and it will be parsed like below.
Read more about [here](https://ta.wikipedia.org/wiki/%E0%AE%B5%E0%AF%86%E0%AE%A3%E0%AF%8D%E0%AE%AA%E0%AE%BE#%E0%AE%B5%E0%AF%86%E0%AE%A3%E0%AF%8D%E0%AE%AA%E0%AE%BE%E0%AE%B5%E0%AF%81%E0%AE%95%E0%AF%8D%E0%AE%95%E0%AE%BE%E0%AE%A9_%E0%AE%AF%E0%AE%BE%E0%AE%AA%E0%AF%8D%E0%AE%AA%E0%AE%BF%E0%AE%B2%E0%AE%95%E0%AF%8D%E0%AE%95%E0%AE%A3%E0%AE%AE%E0%AF%8D)

Usage:
```java
        String thirukkuralTwo="உடுக்கை இழந்தவன் கைபோல ஆங்கே\n" +"இடுக்கண் களைவதாம் நட்பு.";
        Venba venba=Anicham.venba(thirukkuralTwo);
        System.out.println(venba.toString());
        //Prints : "PULIMA KARUVILAM THEMANGAI THEMA\n"+ "PULIMA KARUVILAM KAASU";
```

## **More Utils:**

Currently All utils operates only on Sorkkal.

##### Sol Utils
    
``` java
        //Substring: Similar to anyother substring operations.
        Sol puthumaipitthan = Anicham.sol("புதுமைப்பித்தன்");
        Sol pitthan = Sorkkal.substring(puthumaipitthan,4, 8);
        System.out.println(pitthan); // Prints பித்தன்
```

``` java
        
        //Reverse: Reverse a given Sol.
        Sol srirangam = Anicham.sol("ஶ்ரீரங்கம்");
        Sol reversed = Sorkkal.reverse(srirangam);
        System.out.println(pitthan); // Prints ம்கங்ரஶ்ரீ
```

``` java
        //Remove: Remove Ezhuththu from given Sol
        Sol vaazhiyave = Anicham.sol("வாழியவே");
        Sol vaazhiya = Sorkkal.remove(vaazhiyave,3);
        System.out.println(vaazhiya); // Prints வாழிய
```

``` java

        //Get Ezhuththu : Get Ezhuththu from given sol.
        Sol sembula = Anicham.sol("செம்புலச்");
        Ezhuththu pu = Sorkkal.ezhuththuAt(sembula, 2);
        System.out.println(pu); // Prints பு
```
      
``` java        
        //Get Ezhuththu Count of Given Type
        Sol utthirattavathi= Anicham.sol("உத்திரட்டாதி");
        Sol kahreethu= Anicham.sol("கஃறீது");
        Sol shahaaputheen= Anicham.sol("ஷஹாபுதீன்");

        System.out.println(Sorkkal.countTypeOf(utthirattavathi, EzhuththuType.UYIR)); // Prints 1
        
        Sorkkal.countTypeOf(utthirattavathi, EzhuththuType.MEI); // returns 2
        Sorkkal.countTypeOf(utthirattavathi, EzhuththuType.UYIR_MEI);// returns 4
        
        Sorkkal.countTypeOf(kahreethu,EzhuththuType.AAYTHAM); //returns 1
        
        Sorkkal.countTypeOf(shahaaputheen,EzhuththuType.GRANTHA); //returns 2
```

## Features to be implemented or Limitations

1. Numbers and other token type needs to be recognised.
2. Currently inputs are given as UTF-8, needs to explore more on other tamil encoded fonts and formats.
3. More grammatical rules , for auto correction features for Sol(tamizh words) can be done.
4. Dictionary and more linguistic resources.

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.
Please make sure to update tests as appropriate.
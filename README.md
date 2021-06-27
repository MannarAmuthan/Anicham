# **அனிச்சம்(Anicham)**

Tamizh language parser to parse tamizh texts of UTF-8 encoded. Provides functions for identify and manipulate tamizh strings. Structured by hierchical elements of Tamizh native grammar rules (Ezhuthu, Sol, Vaakiyam). 


## **Core elements:**

**1.எழுத்து(Ezhuththu) - _A Letter_**:

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

**2.சொல்(Sol) - _A word_**:

A word , group of letters(ezhuththukal) create Sol.

Usage:
```java       
        Sol sol=Anicham.sol("அறத்துப்பால்");

        System.out.println(sol.ezhutthuCount()); // Prints 7

        // To get ezhuththukkal from sol
        List<Ezhuththu> ezhutthukkal = sol.ezhutthukkal();
```


**3.வாக்கியம்(Vaakiyam) - _A Sentence_**:

A sentence , group of words(sorkkal) creates Vaakiyangal.

Usage:
```java       
         Vaakiyam vaakiyam = Anicham.vaakiyam("கல் கால் கப்பலின் பீடம் புதுமைப்பித்தன் கூகை பெரியார் சான்றோர் பேதைமை ஒற்றுமை பௌர்ணமி கஃறீது ஶ்ரீஹரி");
         
         System.out.println(vaakiyam.sorkkalCount()); //Prints 13

         // To get Sorkkal from Vaakiyam
         List<Sol> sorkkal = vaakiyam.sorkkal();   
```


**3.பத்தி(Patthi) - _A Paragraph_**:

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

## **More Utils:**

Currently All utils operates only on Sorkkal.
    
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
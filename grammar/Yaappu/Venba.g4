/**
 * @author Amuthan Mannan
 Tamizh Venba Ilakknam antlr4 grammar
 */

grammar Venba;


@header {
    package grammar.Yaappu;
}

venpa: adi+ NEWLINE eetradi;

adi: seer WS seer WS seer WS seer;

eetradi : seer WS seer WS eetru_seer;

seer : eerasai | moovasai;

moovasai : themangai | pulimangai | koovilangai | karuvilangai | themangani | pulimangani | koovilangani | karuvilangani;

eerasai : thema | pulima | koovilam | karuvilam;

themangai: thema ner_asai;

themangani: thema nirai_asai;

pulimangai: pulima ner_asai;

pulimangani: pulima nirai_asai;

koovilangai: koovilam ner_asai;

koovilangani: koovilam nirai_asai;

karuvilangai: karuvilam  ner_asai;

karuvilangani: karuvilam  nirai_asai;


thema : ner_asai ner_asai;

pulima : nirai_asai ner_asai;

koovilam : ner_asai nirai_asai;

karuvilam : nirai_asai nirai_asai;

eetru_seer: ner_asai | nirai_asai | thema | pulima;

nirai_asai: kuril kuril
            | kuril nedil
            | kuril kuril otru+
            | kuril nedil otru+;

ner_asai: kuril | kuril otru+ | nedil | nedil otru+;




kuril: A_UYIR | I_UYIR | U_UYIR | E_UYIR | O_UYIR | UYIR_MEI_A | UYIR_MEI_I | UYIR_MEI_U | UYIR_MEI_E | UYIR_MEI_O ;

nedil : AA_UYIR | EE_UYIR | OO_UYIR |
        AE_UYIR | AI_UYIR | OA_UYIR |
        OU_UYIR | UYIR_MEI_AA | UYIR_MEI_EE |
        UYIR_MEI_OO | UYIR_MEI_AE | UYIR_MEI_AI |
        UYIR_MEI_OA | UYIR_MEI_OU;

otru: MEI | AAYTHAM;


MEI : (UYIR_MEI_A) (PULLI);

UYIR_MEI_OU : (UYIR_MEI_A) (OU);

UYIR_MEI_OA : (UYIR_MEI_A) (O_NEDIL);

UYIR_MEI_O : (UYIR_MEI_A) (O_KURIL);

UYIR_MEI_AI : (UYIR_MEI_A) (I);

UYIR_MEI_AE : (UYIR_MEI_A) (EA_NEDIL);

UYIR_MEI_E : (UYIR_MEI_A) (EA_KURIL);

UYIR_MEI_OO : (UYIR_MEI_A) (U_NEDIL);

UYIR_MEI_U : (UYIR_MEI_A) (U_KURIL);

UYIR_MEI_EE : (UYIR_MEI_A) (NEDIL_SULI);

UYIR_MEI_I : (UYIR_MEI_A) (SULI);

UYIR_MEI_AA : (UYIR_MEI_A) (KAAL);

UYIR_MEI_A : ('\u0B95' | '\u0B99' | '\u0B9A' | '\u0B9E' | '\u0B9F' | '\u0BA3' | '\u0BA4' | '\u0BA8'..'\u0BAA' | '\u0BAE'..'\u0BB5');

A_UYIR : '\u0B85';
AA_UYIR : '\u0B86';
I_UYIR : '\u0B87';
EE_UYIR : '\u0B88';
U_UYIR : '\u0B89';
OO_UYIR : '\u0B8A';
E_UYIR : '\u0B8E';
AE_UYIR : '\u0B8F';
AI_UYIR : '\u0B90';
O_UYIR : '\u0B92';
OA_UYIR : '\u0B93';
OU_UYIR : '\u0B94';
AAYTHAM: '\u0B83';

PULLI : '\u0BCD';

KAAL : '\u0BBE';

SULI : '\u0BBF';

NEDIL_SULI : '\u0BC0';

U_KURIL : '\u0BC1';

U_NEDIL : '\u0BC2';

EA_KURIL : '\u0BC6';

EA_NEDIL : '\u0BC7';

I : '\u0BC8';

O_KURIL : '\u0BCA';

O_NEDIL : '\u0BCB';

OU : '\u0BCC';

NEWLINE  : [\n]+ ;

WS : (' '|[\t])+;
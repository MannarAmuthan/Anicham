/**
 * @author Amuthan Mannan
 */

grammar Tamizh;
@header {
package grammar;
}


tamizh_script: patthi+ EOF;

patthi: vaakiyam+ NEWLINE;

vaakiyam : sol+ STOP_POINT WS;

sol : ezhuththu+ (COMMA | WS)*;

ezhuththu: UYIR
        | MEI
        | AAYTHAM
        | UYIR_MEI_OU
        | UYIR_MEI_OA
        | UYIR_MEI_O
        | UYIR_MEI_AI
        | UYIR_MEI_AE
        | UYIR_MEI_E
        | UYIR_MEI_OO
        | UYIR_MEI_U
        | UYIR_MEI_EE
        | UYIR_MEI_I
        | UYIR_MEI_AA
        | UYIR_MEI_A
        | GRANTHA_MEI
        | GRANTHA_OU
        | GRANTHA_OA
        | GRANTHA_O
        | GRANTHA_AI
        | GRANTHA_AE
        | GRANTHA_E
        | GRANTHA_OO
        | GRANTHA_U
        | GRANTHA_EE
        | GRANTHA_I
        | GRANTHA_AA
        | GRANTHA_A
        | GRANTHA_SRI;

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

UYIR : ('\u0B85'..'\u0B8A' | '\u0B8E'..'\u0B90' | '\u0B92'..'\u0B94') ;

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

AAYTHAM : '\u0B83';


// Grantha Script

GRANTHA_SRI: (GRANTHA_SH) (PULLI) ('\u0BB0')(NEDIL_SULI);

GRANTHA_MEI : (GRANTHA_A) (PULLI);

GRANTHA_OU : (GRANTHA_A) (OU);

GRANTHA_OA : (GRANTHA_A) (O_NEDIL);

GRANTHA_O : (GRANTHA_A) (O_KURIL);

GRANTHA_AI : (GRANTHA_A) (I);

GRANTHA_AE : (GRANTHA_A) (EA_NEDIL);

GRANTHA_E : (GRANTHA_A) (EA_KURIL);

GRANTHA_OO : (GRANTHA_A) (U_NEDIL);

GRANTHA_U : (GRANTHA_A) (U_KURIL);

GRANTHA_EE : (GRANTHA_A) (NEDIL_SULI);

GRANTHA_I : (GRANTHA_A) (SULI);

GRANTHA_AA : (GRANTHA_A) (KAAL);

GRANTHA_A: (GRANTHA_JA) | (GRANTHA_SH) | (GRANTHA_SS) | (GRANTHA_S) | (GRANTHA_H);

GRANTHA_JA: '\u0B9C';

GRANTHA_SH: '\u0BB6';

GRANTHA_SS: '\u0BB7';

GRANTHA_S: '\u0BB8';

GRANTHA_H: '\u0BB9';

PUNCTUATIONS: [!?\\-\\"'`‘]+ -> skip ;

COMMA: ([,]);

WS : (' '|[\t])+;

STOP_POINT : '.';

NEWLINE  : [\n]+ ;
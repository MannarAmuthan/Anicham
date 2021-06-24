grammar Tamizh;
@header {
package grammar;
}

start: vaakiyam | EOF;

vaakiyam: vaarthai | vaakiyam WS vaakiyam ;

vaarthai : elutthu+;

elutthu: UYIR
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
        | UYIR_MEI_A;

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

UYIR : ('\u0B85'..'\u0B8A' | '\u0B8E'..'\u0B90' | '\u0B92'..'\u0B94' | '\u0B83') ;

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

WS : (' '|'\t');

STOP_POINT : '.';

NEWLINE  : [\n]+ -> skip ;
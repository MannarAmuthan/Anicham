grammar Tamizh;
@header {
package grammar;
}

start: vaakiyam | EOF;

vaakiyam: vaarthai |vaakiyam WS vaakiyam  | vaakiyam stop=STOP_POINT;

vaarthai : elutthu+;

elutthu: UYIR | MEI | UYIR_MEI_EE | UYIR_MEI_I |UYIR_MEI_AA | UYIR_MEI_A;

MEI : (UYIR_MEI_A) (PULLI);

UYIR_MEI_EE : (UYIR_MEI_A) (NEDIL_SULI);

UYIR_MEI_I : (UYIR_MEI_A) (SULI);

UYIR_MEI_AA : (UYIR_MEI_A) (KAAL);

UYIR_MEI_A : ('\u0B95' | '\u0B99' | '\u0B9A' | '\u0B9E' | '\u0B9F' | '\u0BA3' | '\u0BA4' | '\u0BA8'..'\u0BAA' | '\u0BAE'..'\u0BB5');

UYIR : ('\u0B85'..'\u0B8A' | '\u0B8E'..'\u0B90' | '\u0B92'..'\u0B94' | '\u0B83') ;

PULLI : '\u0BCD';

KAAL : '\u0BBE';

SULI : '\u0BBF';

NEDIL_SULI : '\u0BC0';

WS : (' '|'\t');

STOP_POINT : '.';

NEWLINE  : [\n]+ -> skip ;
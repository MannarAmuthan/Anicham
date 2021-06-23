grammar Tamizh;
@header {
package grammar;
}

sentence: WS? word+ .? | EOF ;

word : UYIR+ | MEI+ | PRIMARY_UYIR_MEI+  ;

MEI : (PRIMARY_UYIR_MEI) (PULLI);

PRIMARY_UYIR_MEI : ('\u0B95' | '\u0B99' | '\u0B9A' | '\u0B9E' | '\u0B9F' | '\u0BA3' | '\u0BA4' | '\u0BA8'..'\u0BAA' | '\u0BAE'..'\u0BB5');

UYIR : ('\u0B85'..'\u0B8A' | '\u0B8E'..'\u0B90' | '\u0B92'..'\u0B94' | '\u0B83') ;

PULLI : '\u0BCD';

WS : [ \t]+;

NEWLINE  : [\n]+ -> skip ;
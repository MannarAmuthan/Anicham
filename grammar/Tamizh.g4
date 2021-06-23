grammar Tamizh;
@header {
package grammar;
}

word : UYIR;

UYIR : ('\u0B85'..'\u0B8A' | '\u0B8E'..'\u0B90' | '\u0B92'..'\u0B94' | '\u0B83')+ ;

WS  : [ \t\r\n]+ -> skip ;
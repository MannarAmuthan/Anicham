grammar Tamizh;
@header {
package grammar;
}

r   : 'hello' ID;
ID  : [a-z]+ ;
WS  : [ \t\r\n]+ -> skip ;
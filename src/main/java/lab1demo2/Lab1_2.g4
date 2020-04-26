grammar Lab1_2;

prog:   stat+ ;

stat: STRING
    |NEWLINE
    ;

STRING : ~["\\\r\n]*;
NEWLINE:'\r'? '\n' ;     //换行返回
WS  :   [ \t]+ -> skip ; //空格跳过
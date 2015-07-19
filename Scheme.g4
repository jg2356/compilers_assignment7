grammar Scheme;

prog: expr+
    ;
expr: DOUBLE # double
    | BOOLEAN # boolean
    | '(' RATOR expr* ')' # opexpr
    | '(' 'def' ID expr ')' # defvar
    | '(' 'if' expr expr expr ')' # ifexpr
    | '(' 'print' expr ')' # printexpr
    | '(' 'while' expr expr ')' # wloopexpr
    | '(' 'begin' expr+ ')' #blockexpr
    | '(' 'let' letvector expr ')' #letexpr
    | ID # refvar
    ;
letvector: '[' (ID expr)+ ']'
         ;

RATOR: ARITHMETIC_OP | RELATIONAL_OP | BOOLEAN_OP ; 
ARITHMETIC_OP: '^' | '*' | '/' | '+' | '-' ;
RELATIONAL_OP: '=' | '>' | '<' ;
BOOLEAN_OP: '&' | '|' | '!' ;
BOOLEAN: 'true' | 'false' ;
DOUBLE: ('-')? DIGIT+ ( '.' DIGIT+)? ;
ID: LETTER (LETTER|DIGIT|'_')* ;
WS: [ \t\r\n] -> skip ;
fragment
 DIGIT: [0-9] ;
fragment
 LETTER: [a-zA-Z] ;

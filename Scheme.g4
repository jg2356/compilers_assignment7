grammar Scheme;

prog: expr+
    ;
expr: DOUBLE # Double
    | BOOLEAN # Boolean
    | '(' RATOR expr* ')' # OpExpr
    | '(' 'def' ID expr ')' # DefExpr
    | '(' 'if' expr expr expr ')' # IfExpr
    | '(' 'print' expr ')' # PrintExpr
    | '(' 'while' expr expr ')' # WhileExpr
    | '(' 'begin' expr+ ')' # BlockExpr
    | '(' 'let' bind expr ')' # LetExpr
    | '(' 'fun' ID+ expr ')' # FuncExpr
    | '(' 'defun' ID ID+ expr ')' # DefFuncExpr
    | '(' 'call' expr expr+ ')' # CallExpr
    | '(' 'try' expr (ID expr)+ ')' # TryExpr
    | '(' 'raise' ID ')' # RaiseExpr
    | ID # RefExpr
    ;
bind: '[' (ID expr)+ ']'
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

grammar Calculator;

program     : statement+ ; 
statement   : declaration
            | assignment
            | expression SEMI
            ;

declaration : (LET | VAR) ID (ASSIGN expression)? SEMI ;

assignment  : ID ASSIGN expression SEMI ;

expression  : expression op=(MUL | DIV) expression    # MulDiv
            | expression op=(ADD | SUB) expression    # AddSub
            | LPAREN expression RPAREN             # Parens
            | ID                                   # Id
            | NUMBER                               # Num
            ;


LET      : 'let' ;
VAR      : 'var' ;
ASSIGN   : '=' ;
SEMI     : ';' ;
ADD      : '+' ;
SUB      : '-' ;
MUL      : '*' ;
DIV      : '/' ;
LPAREN   : '(' ;
RPAREN   : ')' ;

ID       : [a-zA-Z_] [a-zA-Z0-9_]* ; 
NUMBER   : [0-9]+ ;                  
WS       : [ \t\r\n]+ -> skip ;      
grammar Expr;

// parser rules
prog : decl* expr ';' ; 

decl : 'def' var var* '=' expr 'endef' ;

expr : 'let' var '=' expr 'in' expr     # letinExpr
     | var '(' (expr (',' expr)*)? ')'  # callExpr
     | expr '+' expr                    # infixExpr
     | expr '-' expr                    # infixExpr
     | '(' expr ')'                     # parenExpr
     | number                           # numberExpr
     | '~' '(' expr ')'                 # negationExpr
     | var                              # varExpr
     ;

var : VARIABLE
     | PARAMETER
     | FUNCTION;

number : INT
     | REAL
     | '-' number
     ;

// lexer rules                    
NEWLINE: [\r\n]+ ;

INT: [0-9]+ ;          // should handle negatives
REAL: [0-9]+'.'[0-9]* ; // should handle signs(+/-)

PARAMETER: [a-zA-Z_]+ ;
VARIABLE: [a-zA-Z_-]+ ;
FUNCTION: [a-zA-Z0-9]+ ; // 0-9..?

WS: [ \t\r\n]+ -> skip ;
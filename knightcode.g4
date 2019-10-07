grammar knightcode;

file
	: 'PROGRAM' ID declare body
	;
	
declare
	: 'DECLARE' variable+
	;

variable
	: type ID
	;

type
	: 'INTEGER'
	| 'STRING'
	;
	
body
	: 'BEGIN' stat+ 'END'
	;
	
stat
	: setvar
	| expr
	| print
	| read
	| decision
	| loop
	;
	
setvar
	: 'SET' expr ASSIGN (expr | STRING)
	;
	
expr
	: expr (MUL | DIV) expr
	| expr (ADD | SUB) expr
	| expr comp expr
	| NUMBER
	| ID
	;
	
comp
	: GT
	| LT
	| EQ
	| NEQ
	;
	
print
	: 'PRINT' (STRING | ID)
	;
	
read
	: 'READ' ID
	;
	
decision
	: 'IF' comp expr 'THEN' stat+ ('ELSE' stat+)* 'ENDIF'
	;
	
loop
	: 'WHILE' comp expr 'DO' stat+ 'ENDWHILE'
	;
	
ID
	: LETTER (LETTER | [0-9])*
	;
	
STRING
	: '=' ~["\r\n]*  '='
	;
	
ASSIGN
	: ':='
	;
	
LETTER
	: [a-zA-Z]
	;
	
NUMBER
	: [0-9]+
	;
	
MUL
	: '*'
	;
	
DIV
	: '/'
	;
	
ADD
	: '+'
	;
	
SUB
	: '-'
	;
	
GT
	: '>'
	;
	
LT
	: '<'
	;
	
EQ
	: '='
	;
	
NEQ
	: '<>'
	;

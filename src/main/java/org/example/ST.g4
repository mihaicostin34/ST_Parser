/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar ST;

pou
  : statement+  #multipleStatements
  ;

statement:  var_block  #variableBlockRule
//             | assignment
             ;

var_block
  : ('VAR'  variables+=variable_declaration* 'END_VAR') #variableBlock
  ;

variable_declaration:
  ID ':' type_rule (':=' value )? ';'  #variableDeclaration
;

type_rule:
  BOOLEAN  #booleanType
  | INTEGER #integerType
  ;

//
//assignment:
//    ID ':=' expression ';'
//    | OUTPUT_PIN ':=' expression ';'
//;

//expression:
//left=expression op=MUL right=expression
//          | left=expression op=DIV right=expression
//          | left=expression op=MOD right=expression
//          | left=expression op=ADD right=expression
//          | left=expression op=SUB right=expression
//          | LP expression RP
//          | op = NOT expression
//          | op = SUB expression
//          | left=expression op=OR right=expression
//          | left=expression op=AND right=expression
//          | left=expression op=XOR right=expression
//          | left=expression op=EQ right=expression
//          | left=expression op=DIFF right=expression
//          | left = expression op = GE right = expression
//          | left = expression op = GT right = expression
//          | left = expression op = LT right = expression
//          | left = expression op = LE right = expression
//          | ID
//          | INPUT_PIN
//;

value: boolean_literal  #booleanValue
    | numeric_literal  #numericLiteralValue
    | INPUT_PIN  #inputPinValue
;

boolean_literal: 'TRUE'  #trueValue
               | 'FALSE'  #falseValue
               ;

numeric_literal
  : '-'? Binary_literal #binaryValue
  | '-'? Octal_literal #octalValue
  | '-'? Decimal_literal #decimalValue
  | '-'? Floating_point_literal #floatValue
  | '-'? Hexadecimal_literal #hexValue
  ;

INPUT_PIN: 'INPUT_PIN_'[0-9]+;
OUTPUT_PIN: 'OUTPUT_PIN_'[0-9]+;

Binary_literal : '2#' Binary_digit Binary_literal_characters? ;
fragment Binary_digit : [01] ;
fragment Binary_literal_character : Binary_digit | '_'  ;
fragment Binary_literal_characters : Binary_literal_character+ ;

Octal_literal : '8#' Octal_digit Octal_literal_characters? ;
fragment Octal_digit : [0-7] ;
fragment Octal_literal_character : Octal_digit | '_'  ;
fragment Octal_literal_characters : Octal_literal_character+ ;

Decimal_literal		: [0-9] [0-9_]* ;
Pure_decimal_digits : [0-9]+ ;
fragment Decimal_digit : [0-9] ;
fragment Decimal_literal_character : Decimal_digit | '_'  ;
fragment Decimal_literal_characters : Decimal_literal_character+ ;

Hexadecimal_literal : '16#' Hexadecimal_digit Hexadecimal_literal_characters? ;
fragment Hexadecimal_digit : [0-9a-fA-F] ;
fragment Hexadecimal_literal_character : Hexadecimal_digit | '_'  ;
fragment Hexadecimal_literal_characters : Hexadecimal_literal_character+ ;

Floating_point_literal
 : Decimal_literal Decimal_fraction? Decimal_exponent?
 ;

fragment Decimal_fraction : '.' Decimal_literal ;
fragment Decimal_exponent : Floating_point_e Sign? Decimal_literal ;
fragment Floating_point_e : [eE] ;
fragment Floating_point_p : [pP] ;
fragment Sign : [+\-] ;

string_literal
  : Static_string_literal
  ;
Static_string_literal : '\'' Quoted_text? '\'' ;
fragment Quoted_text : Quoted_text_item+ ;
fragment Quoted_text_item
  : Escaped_character
  | ~["\n\r\\]
  ;
fragment
Escaped_character
  : '$' [$'LNPRT]
  | '$' Hexadecimal_digit Hexadecimal_digit
  ;

ID: [A-Za-z][A-Za-z_0-9]*;
MUL: '*';
DIV: '/';
MOD: '%';
ADD: '+';
SUB: '-';
NOT: '!';
LP:'(';
RP:')';
AND: 'and';
OR: 'or';
XOR: 'xor';
GT: '>';
GE: '>=';
LT: '<';
LE: '<=';
EQ: '==';
DIFF: '!=';
BOOLEAN: ' BOOL';
INTEGER: ' INT';
WS : [ \n\r\t]+ -> channel(HIDDEN) ;
Block_comment : '(*' (Block_comment|.)*? '*)' -> channel(HIDDEN) ; // nesting comments allowed
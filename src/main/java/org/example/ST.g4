/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar ST;

pou
  : statement*
  ;

statement: //function
//             | function_block
             var_block
             | assignment
             ;

//function: 'FUNCTION' name=ID ':' type=type_rule var_blocks+=var_block*;
//
//function_block:
//  'FUNCTION_BLOCK' name=ID
//  var_blocks+=var_block*;

var_block locals[boolean input, boolean output, boolean temp]
  : ('VAR'
     | { $input=true; } 'VAR_INPUT'
     | { $output=true; } 'VAR_OUTPUT'
     | { $input=$output=true; } 'VAR_INPUT_OUTPUT'
     | { $temp=true; } 'VAR_TEMP')
    ( variables+=variable_declaration* 'END_VAR');

type_rule:
  name=ID #simpleType
//  | array=array_type #arrayType
//  | pointer=pointer_type #pointerType
  ;

//array_type
//  : 'ARRAY' '[' ranges+=range (',' ranges+=range)* ']' 'OF' type=type_rule;

//range
//  : lbound=integer_literal '..' ubound=integer_literal;

//pointer_type: 'POINTER' 'TO' type=type_rule;

variable_declaration:
  names+=ID (',' names+=ID)* ':' type=type_rule (':=' initializer=variable_initializer)? ';'
  ;

variable_initializer:
  literal;

literal:
  numeric_literal | string_literal | boolean_literal | ID;

assignment:
    ID ':=' expression ';'
    | OUTPUT_PIN ':=' expression ';'
;

expression:
left=expression op=MUL right=expression
          | left=expression op=DIV right=expression
          | left=expression op=MOD right=expression
          | left=expression op=ADD right=expression
          | left=expression op=SUB right=expression
          | LP expression RP
          | op = NOT expression
          | op = SUB expression
          | left=expression op=OR right=expression
          | left=expression op=AND right=expression
          | left=expression op=XOR right=expression
          | left=expression op=EQ right=expression
          | left=expression op=DIFF right=expression
          | left = expression op = GE right = expression
          | left = expression op = GT right = expression
          | left = expression op = LT right = expression
          | left = expression op = LE right = expression
          | ID
;

boolean_literal: 'TRUE' | 'FALSE' | INPUT_PIN;

numeric_literal
  : '-'? integer_literal
  | '-'? Floating_point_literal
  ;

integer_literal
 : Binary_literal
 | Octal_literal
 | Decimal_literal
 | Pure_decimal_digits
 | Hexadecimal_literal
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
WS : [ \n\r\t]+ -> channel(HIDDEN) ;
Block_comment : '(*' (Block_comment|.)*? '*)' -> channel(HIDDEN) ; // nesting comments allowed
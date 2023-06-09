/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar ST;

start
  : block  #multipleStatements
  ;

block: (statement)+ #blockRule
;

statement:  var_block  #variableBlockRule
             | assignment #assignmentRule
             | if #ifRule
             | while #whileRule
             | case #caseRule
             ;

var_block
  : ('VAR'  variables+=variable_declaration* 'END_VAR') #variableBlock
  ;

variable_declaration:
  ID ':' type_rule (':=' value )?  #variableDeclaration
;

type_rule:
  BOOLEAN  #booleanType
  | INTEGER #integerType
  ;


assignment:
    ID ':=' expression #idAssignment
    | OUTPUT_PIN ':=' expression #ouputAssignment
;

if: 'IF' expression 'THEN' if_block = block (else_clause = else)? 'END_IF' #ifBranch
;

else : 'ELSE' else_block = block #elseBranch
;

while: 'WHILE' expression 'DO' block 'END_WHILE' #whileLoop
;

expression:
    value #expressionValue
    | left = expression op = MUL right = expression #expressionMul
    | left=expression op=DIV right=expression #expressionDiv
    | left=expression op=MOD right=expression #expressionMod
    | left=expression op=ADD right=expression #expressionAdd
    | left=expression op=SUB right=expression #expressionSub
    | LP expression RP #expressionBrackets
    | op = NOT expression #expressionNot
    | op = SUB expression #expressionNeg
    | left=expression op=OR right=expression #expressionOr
    | left=expression op=AND right=expression #expressionAnd
    | left=expression op=XOR right=expression #expressionXor
    | left=expression op=EQ right=expression #expressionEquals
    | left=expression op=DIFF right=expression #expressionDiff
    | left = expression op = GE right = expression #expressionGE
    | left = expression op = GT right = expression #expressionGT
    | left = expression op = LT right = expression #expressionLT
    | left = expression op = LE right = expression #expressionLE
    ;

case: 'CASE' expression 'OF' (case_branch)+ (else)? 'END_CASE' #caseStatement
;

case_branch: value ':'block  #caseBranch
;

value: boolean_literal  #booleanValue
    | numeric_literal  #numericLiteralValue
    | INPUT_PIN  #inputPinValue
    | ID #idValue
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
SEMICOLON: ';' ->skip;
Block_comment : '(*' (Block_comment|.)*? '*)' -> channel(HIDDEN) ; // nesting comments allowed
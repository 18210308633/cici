grammar Lisp ;

import CommonLexer;

LEFT_BRACKET : '(' ;

RIGHT_BRACKET: ')' ;

/*数学运算*/
PERCENT : '%' ;

DIVISION : '/';

PLUS : '+';

SUBTRACT : '-';

MULTIPLY : '*';

CEIL:C E I L;

RANDOM:R A N D O M;

SUM : S U M;

COMMA : ',';

COUNT : C O U N T ;

AVG : A V G;

MAX : M A X;

MIN : M I N;
/*参数类型转换*/
CAST:C A S T;

INT_WORD:I N T;

STRING_WORD:S T R I N G;

BIGINT_WORD:B I G I N T;

DOUBLE_WORD:D O U B L E;

NULL_WORD:N U L L;

SIGN : '+'|'-';

INT : SIGN?DIGIT+ ;

DOUBLE: SIGN?DIGIT+'.'DIGIT+;

INTS :
    INT |
    INT COMMA INTS+  ;

/* 逻辑比较符 */
EQ:'=';
GT:'>';
GE:'>=';
LT:'<';
LE:'<=';
INEQ:'<>'|'!=';
AND_WORD:A N D;
OR_WORD:O R;

CASE:C A S E;

ZHONGWEN:HANZI+;

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

WORD:[a-zA-Z0-9_]+;
/* 一个lisp 表达式*/
parse:
    having_parse|
    math_parse |
    case_parse |
    identify_parse|
    cast_parse |
    common_lisp_parse |
    logic_parse
;
/* 聚合运算 */
having_operator:
    SUM|COUNT|AVG|MAX|MIN;
having_parse:
    LEFT_BRACKET having_operator no1 no2? RIGHT_BRACKET|
    LEFT_BRACKET COUNT no5 RIGHT_BRACKET|
    LEFT_BRACKET COUNT no1 ('~'no8)? RIGHT_BRACKET;
/* 基本数学运算 */
math_operator:
    PLUS|SUBTRACT|MULTIPLY|DIVISION|PERCENT|CEIL|RANDOM;
math_parse:
    LEFT_BRACKET math_operator no1 no1 RIGHT_BRACKET
    |LEFT_BRACKET math_operator no1 RIGHT_BRACKET
    |LEFT_BRACKET math_operator RIGHT_BRACKET;

/* 条件表达式case when */
case_parse:
    case_parse_condition|case_parse_simple;
case_parse_simple:     /*简单模式*/
    LEFT_BRACKET CASE no1 (no1 (no1|no9))+ no1? RIGHT_BRACKET
    ;
case_parse_condition:   /*条件查找模式*/
    LEFT_BRACKET CASE (logic_parse (no1|no9))+ no1? RIGHT_BRACKET
    ;

/* 逻辑表达式 */
logic_operator_simple:
   EQ|INEQ|GT|GE|LT|LE
    ;
logic_operator_complex:
    AND_WORD|OR_WORD;

logic_parse:
    LEFT_BRACKET logic_operator_simple no1 no1 RIGHT_BRACKET|
    LEFT_BRACKET logic_operator_complex logic_parse+ RIGHT_BRACKET
    ;
/* 类型转换 */
field_type:
    INT_WORD|BIGINT_WORD|DOUBLE_WORD|STRING_WORD;
cast_parse:
   LEFT_BRACKET CAST field_type no1 RIGHT_BRACKET;
/* 标识 参数类型 */
identify_parse:
   LEFT_BRACKET INT_WORD no3  RIGHT_BRACKET |
   LEFT_BRACKET STRING_WORD no4  RIGHT_BRACKET
;
/* 通用 lisp表达式 */
common_lisp_parse:
    LEFT_BRACKET ('func'|'func_none') no7 no6+ RIGHT_BRACKET
;
/* 参数 */
no1:
   INT | parse
;
/* 参数-聚合依据 */
no2:
     INT | INTS
 ;
/* 参数-数字类型*/
no3:
  (INT|DOUBLE)
 ;
/* 参数-字符串类型*/
no4:
 (ZHONGWEN|WORD|INT|DOUBLE)+
;
/* 参数-@*/
no5:
  '@'
;
no6:
   (WORD|INT|parse)
;
no7:
   WORD|having_operator
;
no8:
    DOUBLE;
no9:
    NULL_WORD;





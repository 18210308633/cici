/*
Grammars always start with a grammar header;
This grammar is called ArraryInit and must match the fileName ArraryInit.g4
*/
grammar ArraryInit;
/*=============================*/
/* parse rules start with lowercase letters*/
/*=============================*/
init : '{' value (',' value)* '}' ;//match at least one value
/** A value can be either a nested array/struct or a simple integer (INT)*/
value : init
      | INT
      ;
INT : [0-9]+; //Define token INT as one or more digits
WS : [\t\r\n]+ -> skip; // Define whitespace rule,toss it out
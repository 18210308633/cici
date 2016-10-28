grammar SomeLanguage; // 声明语法头

/*
*========================
*   一些 options 配置
*=======================
*/

options {
    language = Java; //设定生成代码的语言
}

/**
 =========================
   rule
 =========================
*/
classDeclaration : 'class' className '{' (method)* '}';
className : ID ;
method : methodName '{' (instruction)+ '}' ;
methodName : ID ;
instruction : ID ;

ID : [a-zA-Z0-9]+ ;
WS: [ \t\n\r]+ -> skip ;


%{
#include<stdio.h>
%}
%token nl number letter
%%
stmt :var nl {
    printf("Valid Variable");
    exit(0);
}
var :letter an 
;
an : letter an | number an | letter | number
;
%%
int yyerror(){
    printf("invalid");
}
int main(){
    printf("Enter a variable:");
    yyparse();
    return 0;
}
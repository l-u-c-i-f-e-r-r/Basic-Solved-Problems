%option noyywrap
%{
#include<stdio.h>
%}
%%
[a-z]*a{3}[a-z]* {
printf("Valid Accept");
}
.* {
printf("Invalid Reject");
}
%%
int main(){
yylex();
return 0;
}
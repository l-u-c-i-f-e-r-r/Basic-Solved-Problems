%option noyywrap
%{
    #include<stdio.h>
%}
%%
[A-Z][a-z]+ {
    printf("Valid Name");
}
[a-z]+@[a-z]+\.[a-z]+ {
    printf("Valid Email");
}
[0-9]{10} {
    printf("Valid number");

}
.* {
    printf("Invalid");
    }
%%
int main(){
    yylex();
    return 0;

}
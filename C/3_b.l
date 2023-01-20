%option noyywrap
%{
#include<stdio.h>
%}
%%
"int"|"float"|"void"|"return"|"printf"|"scanf"|"main" {
printf("%s-Keyword\n",yytext);
}
";"|"," {
printf("%s - Special Symbol\n",yytext);
}
"+"|"-"|"*"|"="|"<" {
printf("%s - Operators\n",yytext);
}
"["|"]"|"{"|"("|")"|"}" {
printf("%s - Brackets\n",yytext);
}
[a-z]+[0-9]*_* {
printf("%s - Identifier\n",yytext);
}
[0-9]+ {
printf("%s - Constant\n",yytext);
}
%%
int main()
{
yyin=fopen("3_b.txt","r");
yylex();
return 0;
}
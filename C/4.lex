%option noyywrap
%{
    #include<stdio.h>
    #include<y.tab.h>
%}
%%
[0-9]+ {return number;}
[a-z]+ {return letter;}
[\n] {return nl;}
%%
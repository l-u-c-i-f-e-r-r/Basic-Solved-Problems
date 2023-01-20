%option noyywrap
%{
    #include<stdio.h>
    int l=0,w=0,c=0;
%}
%%
" " {
    w++;
}
"\n" {
    l++;
    w++;
}
. {
    c++;
}
%%
int main(){
    yyin=fopen("3_b.txt","r");
    yylex();
    printf("Lines: %d\tWords: %d\tCharacter: %d",l,w,c);
    return 0;
}
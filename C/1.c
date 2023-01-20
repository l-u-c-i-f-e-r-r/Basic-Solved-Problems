#include<stdio.h>
#include<string.h>
#include<ctype.h>
int main(){
    int i=0;
    char ch,cha[100];
    printf("Enter a string ending with '$'");
    for(i=0;i>=0;i++){
        scanf("%c",&ch);
        if(ch=='$'){
            break;
        }
        cha[i]=ch;

    }
    for(i=0;cha[i]!='\0';i++){
        if(isalpha(cha[i])){
            printf("%c\t%p\tIdentifier\n",cha[i],&cha[i]);

        }
        else{
            printf("%c\t%p\tOperator\n",cha[i],&cha[i]);
        }
    }
    return 0;
    
}

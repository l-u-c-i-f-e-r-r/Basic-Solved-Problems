#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int main(){
    int i=0,kflag=0;
    char op[10][10]={"+","-","*","/","%","="};
    char key[10][10]={"int","char","boolean"};
    char spec[10][10]={";",","};
    char bra[10][10]={"[","]","{","}","(",")"};
    FILE *fp;
    char *str=malloc(sizeof(char));
    fp=fopen("2.txt","r");
    while(!feof(fp)){
        fscanf(fp,"%s",str);
        for(i=0;i<3;i++)
        {
            if(strcmp(str,key[i])==0)
            {
                printf("%s - Keyword \n",str);
                kflag=1;
                break;
            }
        }

        for(i=0;i<3;i++)
        {
            if(strcmp(str,fp[i])==0)
            {
                printf("%s - Delimitors \n",str);
                break;
            }
        }
        for(i=0;i<3;i++)
        {
            if(strcmp(str,fp[i])==0)
            {
                printf("%s - Brackets \n",str);
                break;
            }
        }

        for(i=0;i<3;i++)
        {
            if(strcmp(str,op[i])==0)
            {
                printf("%s - Operators \n",str);
                break;
            }
        }
        int i=0,d=0;
        if(isdigit(str[i]))
        {
            d++;
            for(i=1;i<strlen(str);i++)
            {
                if(isdigit(str[i]))
                d++;
            }

            if(d==strlen(str))
            printf("%s - Constant \n",str);
        }
        if(kflag!=1)
        {
            i=0;
            d=0;
            if(isalpha(str[i]))
            {
                d++;
                for(i=1;i<strlen(str);i++)
                {
                    if(isdigit(str[i])||isalpha(str[i])||strcmp(str,"_"))
                    d++;
                }
        if(d==strlen(str))
        printf("%s - Identifier \n",str);
    }
}
kflag=0;
}
} 

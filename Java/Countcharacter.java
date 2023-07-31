import java.util.*;
public class Countcharacter{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int count=0;
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            int temp=1;
            for(int j=i+1;j<s.length();j++){
                if(a==s.charAt(j)){
                    temp++;
                   s= s.replaceAll(""+a,"");
                   System.out.println(s);
                }
            }
            if(temp>1){
                count++;
            }

        }
        System.out.print(count);


    }
}
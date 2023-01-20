import java.util.*;
public class Vowelconsrev {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String s=sc.next(),b;
    b=s.toLowerCase();
    for(int i=0;i<s.length();i++){
        if(b.charAt(i)=='a' || b.charAt(i)=='e' || b.charAt(i)=='i' || b.charAt(i)=='o' || b.charAt(i)=='u'){
            System.out.print(s.charAt(i));
        }
    }
    for(int j=s.length()-1;j>=0;j--){
        if(b.charAt(j)!='a' && b.charAt(j)!='e' && b.charAt(j)!='i' && b.charAt(j)!='o' && b.charAt(j)!='u'){
            System.out.print(s.charAt(j));
        }
    }
    }
}

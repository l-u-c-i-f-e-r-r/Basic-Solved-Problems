import java.util.*;
public class ReverseNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b;
        for(int i=0;a!=0;i++){
            b=a%10;
            System.out.print(b);
            a/=10;
        }
    }
    
}

import java.util.*;
public class Power {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=1;
        for(int i=1;i<=b;i++){
            c*=a;
        }
        System.out.print(c);
    }
}

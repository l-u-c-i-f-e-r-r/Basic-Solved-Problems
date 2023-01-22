import java.util.*;
class Factorial{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),a=1;
        for(int i=1;i<=n;i++){
            a*=i;
        }
        System.out.print(a);
    }
}
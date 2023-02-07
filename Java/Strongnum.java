import java.util.*;
public class Strongnum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int n=sc.nextInt(),m=n;
        while(m!=0){
            int temp=m%10,fact=1;

            for(int i=temp;i>0;i--){
                fact*=i;
            }
            sum+=fact;
            m/=10;
        }
        if(sum==n){
            System.out.print("Strong");

        }
        else{
            System.out.print("Not Strong");
        }
    }
}

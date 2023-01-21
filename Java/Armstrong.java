import java.util.*;
import java.lang.*;
public class Armstrong {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),i,b=n,sum=0,c=1,m=n;
        for(i=0;n!=0;i++){
            n/=10;
        }
        for(int j=0;c!=0;j++){
            c=m%10;
            sum+=Math.pow(c,i);
            m/=10;

        }
        if(b==sum)
        {
            System.out.print("Armstrong");
        }
        else{
            System.out.print("Not a Armstrong");
        }
    }
    
}

import java.util.*;
public class Sample {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),count;
        if(a==1){
            a+=1;
        }
        for(int j=a;j<=b;j++){
            count=0;
        for(int i=2;i<=j;i++){

            if(j%i==0){
                count++;
            }
        }
        if(count<2){
            System.out.print(j+" ");
        }
    }
        
        
    }
}

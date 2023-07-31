import java.util.*;
public class Staircase {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),count=0;
        for(int i=0;n!=0;i++){
            for(int j=0;j<=i&& n!=0;j++){
                System.out.print("O ");
                n--;
                if(i==j)count++;
            }
            System.out.println();
        }
        System.out.println(count);
    }
    
}

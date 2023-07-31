import java.util.*;

public class AddTwoStrings {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String input1=sc.nextLine();
        input1=input1.toUpperCase();
        String[] s=input1.split(" ");
        //System.out.print(s[1]);
        int sum[]=new int[s.length];
        for(int i=0;i<s.length;i++){
            String s1=s[i];
            int sum1=0;
        for(int j=0;j<s1.length();j++){
        for(int k=s1.length()-1;k>=0;k--){
            if(j==k){
                sum1+=s1.charAt(j)-64;
            }
            else{       
                int f=s1.charAt(j)-64;
                int l=s1.charAt(k)-64;
                sum1+=Math.abs(f-l);
                System.out.println(i+" "+sum1+"\n");
                }
            }
        }
        sum[i]=sum1;

        }
    //System.out.println("\n\n"+sum[0]);

    }
}

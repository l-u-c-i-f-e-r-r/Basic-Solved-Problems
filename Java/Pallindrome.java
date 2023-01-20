import java.util.*;
public class Pallindrome {
public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b,rev=0;
        while(a!=0)
        {
          b=a%10;
          rev=rev*10+rev;
          a/=10;
        }
      // palindrome if num and reverse are equal
      if(a==rev)
        System.out.println (a+" is Palindrome");
      else
        System.out.println (a+" is not Palindrome");


    }
}

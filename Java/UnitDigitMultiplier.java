import java.util.*;
public class UnitDigitMultiplier
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int k=0;
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		for(int j=n-1;j>=0 && k<n ;j--,k++ ){
		    int l=a[j]%10;
		    b[k]=a[k]*l;
		    System.out.print(b[k]+" ");
		}
	}
}
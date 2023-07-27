package Function;
import java.util.*;
public class OddNUmberSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OddNUmberSum.Function2();

	}
	
	public static void Function2() {
		int i;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number till which sum of odd should aclculate");
		int n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			if(i%2!=0) {
				sum=sum+i;
				
				
			}
			
		}
		
	System.out.println("Sum of odd number till n is "+sum);
	}

}

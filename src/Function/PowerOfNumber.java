package Function;
import java.util.*;

public class PowerOfNumber {

	public static void main(String[] args) {
		PowerOfNumber.Function();
		// TODO Auto-generated method stub

	}
	public static void Function()
	{ 
		int power=1;
		Scanner sc=new Scanner(System.in);	
		System.out.println("enter the value of x");
		int x=sc.nextInt();
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) 
		{
			 power=power*x;
		}
		System.out.println("power of "+x+" to"+ n+" is "+power);
	
	}

}

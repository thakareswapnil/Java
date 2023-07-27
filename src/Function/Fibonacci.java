package Function;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Function8();
	}

	

	
	public static void Function8()
	{ 
		int fi=0;
		System.out.println("");
		Scanner sc=new Scanner(System.in);	
		System.out.println("enter number  of n");
		int n=sc.nextInt();
		
		int power = 0;
		int x = 0;
		for(int i=1;i<=n;i++) 
		{
			 power=power*x;
		}
		System.out.println("power of "+x+" to"+ n+" is "+power);
	
	}
}


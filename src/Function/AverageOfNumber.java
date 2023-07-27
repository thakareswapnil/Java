package Function;
import java.util.*;

public class AverageOfNumber {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		AverageOfNumber.Function1();

	}
	public static void Function1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the three number");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();	
		int avg=(num1+num2+num3)/3;
		System.out.println("Avrage of three number is "+avg);
		
	}

}

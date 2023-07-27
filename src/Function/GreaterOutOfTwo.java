package Function;
import java.util.*;

public class GreaterOutOfTwo {

	public static void main(String[] args) {
		GreaterOutOfTwo.Function3();

	}
	public static void Function3()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the twp number");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		if(n1>n2) {
			System.out.println(n1+ " is greater number");
		}
		else
		{
			System.out.println(n2+ " is greater number");
		}
	}  

}

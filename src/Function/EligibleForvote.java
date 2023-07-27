package Function;
import java.util.*;

public class EligibleForvote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EligibleForvote.Functon5();

	}
		public static void Functon5()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the age of person ");
			int age=sc.nextInt();
			if(age>18)
			{
			System.out.println("Person is eligible for voting");
			
		}else {
			System.out.println("person is not eligible for voting");
		}

	}
}

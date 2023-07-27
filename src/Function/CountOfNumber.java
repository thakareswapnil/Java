package Function;
import java.util.*;

public class CountOfNumber {



		//public class Solutions {
		   public static void main(String args[]) {
		       int positive = 0, negative = 0, zeros = 0;
		       Scanner sc = new Scanner(System.in);
		       System.out.println("enter the number of number ");
		       int m=sc.nextInt();
		       int i;
		      // System.out.println("Press 1 to continue & 0 to stop");
		       for(i=1;i<=m;i++)
		       {
		      
		       System.out.println("enterthe number");
		       int number = sc.nextInt();


		      // while(input == 1)
		       
		          // System.out.println("Enter your number : ");
		           //nt number = sc.nextInt();
		           if(number > 0) {
		               positive++;
		           } else if(number < 0) {
		               negative++;
		           } else {
		               zeros++;
		           }


		          // System.out.println("Press 1 to continue & 0 to stop");
		         //  input = sc.nextInt();
		       }


		       System.out.println("Positives : "+ positive);
		       System.out.println("Negatives : "+ negative);
		       System.out.println("Zeros : "+ zeros);
		   }   
		

		
	}



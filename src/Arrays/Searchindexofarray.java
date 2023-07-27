package Arrays;
import java.util.*;
public class Searchindexofarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		//Array created size of which is taken from user 
		int number[]=new int[size];
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the number at"+i+"position");
			number[i]=sc.nextInt();
		}
		
		System.out.println("Arrays is ");
	   for(int i=0;i<size;i++) 
	   {
		 System.out.println(number[i]);
	   }
	   
	   
	   System.out.println("enter the number whoes position you want to find out");
	 int x =sc.nextInt();

	 
	 for(int i=0;i<size;i++) 
	 {
		 if(number[i]==x)
		 {
			 System.out.println("position of  "+x+"is "+i);
		 }
		 
	 }
	 
	 
		 
		
	}

}

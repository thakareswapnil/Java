package Arrays;
import java.util.*;
public class ArraysOfNames {
	
	
	
	public static void main(String args[]) {
		System.out.println("enter the size of array");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		
		String name[]=new String[size];
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the name at"+(i+1)+"position");
			name[i]=sc.next();
		}
		System.out.println("Arrays is of name is  ");
		   for(int i=0;i<size;i++) 
		   {
			 System.out.print("name " + (i+1) +" is : " + name[i]);
		   }
		   
		
	}

}

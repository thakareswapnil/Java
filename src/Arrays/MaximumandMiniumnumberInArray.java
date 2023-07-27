package Arrays;
import java.util.*;
public class MaximumandMiniumnumberInArray {

	public static void main(String[] args) 
	{
		System.out.println("Enter the size of array");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		
		int number[] =new int[size];
	//	sc.close();
		System.out.println("enter the numbers of array");
		for(int i=0;i<size;i++) {
			number[i]=sc.nextInt();
		}
		
		System.out.println("enter the  array is ");
		for(int i=0;i<size;i++) {
			System.out.println(number[i]);
		}
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<size;i++)
		{
			if(number[i]<min) {
				min=number[i];
			}
			
		}
		for(int i=0;i<size;i++) {
			if(number[i]>max) {
				max=number[i];
			}
		}
		
		System.out.println("minimum value in array is "+min);
		System.out.println("maximum  value in array is "+max);
	}
	
}
				

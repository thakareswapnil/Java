package ArrayList;

import java.util.Arrays;
import java.util.ArrayList;

public class ArrayIntoArraylist {

	public static void main(String[] args) {
		
		String arr[]= {"aaa","ssss","dffff"};
		
		for(Object obj:arr) {
			
			System.out.println(obj);
		}
		
		ArrayList<String> al2=new ArrayList<String>(Arrays.asList(arr));
		
		System.out.println(al2);
		
		for(Object obj:al2) {
			
			System.out.println(obj);
		}
		
	}

}

package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(11);
		al.add(22);
		al.add(33);
		al.add(789);
		al.add(524);
		al.add(900);
		//al.add("aaa");
		
		System.out.println(al);
		System.out.println();
		
		//Addall
		
		ArrayList<Integer> add=new ArrayList<Integer>();
		add.addAll(al);
		System.out.println(add);
		
		System.out.println();
		//removeall
		
		System.out.println(al);
		Collections.sort(al);
		System.out.println();
		System.out.println(al);
		System.out.println();
	    Collections.reverse(al);
	    System.out.println(al);	
		
		Collections.sort(al, Collections.reverseOrder());
		System.out.println();
		System.out.println(al);
		
		
		
		Collections.shuffle(al);
		System.out.println();
		System.out.println(al);
		
		System.out.println();
		Collections.shuffle(al);
		System.out.println(al);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

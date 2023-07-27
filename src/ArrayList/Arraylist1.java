package ArrayList;

import java.util.ArrayList;

public class Arraylist1 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
	//static arraylist
		ArrayList<Integer> AL2 = new 	ArrayList<Integer>();
		AL2.add(123);
		AL2.add(55);
		AL2.add(55);
		
		
		System.out.println("AL2= "+AL2);
		
		for(Object in:AL2) {
			System.out.println(in);
		}
		
		//dynamic arraylist
		
		
		@SuppressWarnings("rawtypes")
		ArrayList al3=new ArrayList();
		al3.add("stringfff");
		al3.add(456);
		System.out.println("al3- "+al3); 
		
		
		al3.add(789789);
		al3.add(2.5f);
		al3.add(89988l);
		al3.add(5.55);
		al3.add(true);
		
		System.out.println(al3); 
		
		System.out.println(al3.size());
		
		
		al3.remove(2.5f);
		al3.remove(89988l);
		//al3.remove(1);
		al3.add(3,2);
		al3.add(789);
		
		al3.remove(4);
		
		System.out.println(al3);
		
		
		//retrieve /to get variable from arraylist
		
		System.out.println(al3.get(2));
		
		al3.add(4, "yyyyy");
		
		System.out.println(al3);
		
		
		//to change value
		al3.set(4, "zzzz");
		
		System.out.println(al3);
		
		
		//value is present in list or not
		System.out.println(al3.isEmpty());	
		
		System.out.println(AL2.isEmpty());	
		
		
		for(int i=0;i<al3.size();i++) {
			
			System.out.println(al3.get(i));
			
		}
		System.out.println("for each loop");
		
		
		for(Object ojb:al3) {
			System.out.println(ojb);
		}
		
		
		
		
	
		
	}

}

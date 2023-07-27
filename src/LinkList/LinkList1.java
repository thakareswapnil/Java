package LinkList;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class LinkList1 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		LinkedList ll1=new LinkedList();//declaration of singly linklist
		
		LinkedList ll2=new LinkedList();
		
		LinkedList ll3=new LinkedList();

		
		
		//add data
		ll1.add(12);
		ll1.add(13);
		ll1.add(14);
		ll1.add(15);
		ll1.add(16);
		ll1.add(17);
		ll1.add("aaa");
		ll1.add("bbb");
		ll1.add("kkkk");
		ll1.add("hhh");
		
		ll2.add(12);
		ll2.add(13);
		ll2.add(14);
		ll2.add(15);
		ll2.add(16);
		ll2.add(17);
		ll2.add("aaa");
		ll2.add("bbb");
		ll2.add("kkkk");
		ll2.add("hhh");
		
		System.out.println(ll1);
		
		System.out.println();
		
		System.out.println(ll1.size());
		
		System.out.println();
	
		
		
		
		//remove
		ll1.remove(1);
		
		System.out.println(ll1);
		
		System.out.println();
		
	
		System.out.println("LL2 -"+ll2);
		
		ll2.removeAll(ll2);
		
		System.out.println("LL2 -"+ll2);
		
		
		
		
		//copy data from one linkedlist to another 
		
		
		ll3.addAll(ll1);
		
		System.out.println("LL3 -"+ll3);
		
		System.out.println((ll1.isEmpty()));
		
		System.out.println(ll1.getClass());
		
		System.out.println();
		System.out.println();
		
		
		
		
		LinkedList ll4=new LinkedList();
		
		
		
		//collection
	
    	Collections.sort(ll4);
		
	   System.out.println(ll4);
		
	
	
	  Collections.shuffle(ll4);
		
	   System.out.println(ll4);
	

	   System.out.println();
	   System.out.println();
	   
	   ll1.removeFirst();
	
	  ll1.removeLast();
	
	  System.out.println(ll1);
	  
	  System.out.println(ll1.contains("aaa"));
	  System.out.println();
	   System.out.println();
	  
	  for(int i=0;i<ll1.size();i++)
	  {
		  System.out.println(ll1.get(i));
	  }
	  System.out.println();
	   System.out.println();
	   System.out.println();
	   System.out.println();
	System.out.println(ll1.get(5));
		
	 System.out.println();
	   System.out.println();
	//for each loop
	
	for(Object obj:ll1) {
		System.out.println(obj);
	}
	
	Collections.sort(ll4,Collections.reverseOrder());
		
	System.out.println(ll4);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

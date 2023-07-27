package MapInterface;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		
		
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		HashMap<Object, Object> hm2=new HashMap<Object, Object>();
		
		HashMap hm1=new HashMap<>();
		
		
		hm1.put(100, "dafasf");
		System.out.println(hm1.remove(100));
		
		System.out.println(hm1);
		
		hm2.put(100,"thakere");
		System.out.println(hm2);
		
		//to insert the data in Hashmap
	    hm.put(107,"swapnil");
	    hm.put(106,"raj");
	    hm.put(105,"nitsh");
	    hm.put(102,"rajesh");
	    hm.put(109,"thakare");
	    hm.put(111,"ravi");
	    hm.put(112,"hitsh");
	    hm.put(120,"jayesh");
	    System.out.println(hm);
	    
	    System.out.println("************");
	    
	    System.out.println(hm.get(102));//it will give value of key
	    System.out.println("************");
	   System.out.println(hm.get("rajesh"));//it will not give key gives null value
	   hm.get(105);
	   System.out.println("************");
	   System.out.println(hm);
	   
	   //for get size
	   System.out.println(hm.size());
	   
	   System.out.println("************");
	   //return true and false
	   System.out.println(hm.containsKey(105));//true
	   System.out.println(hm.containsKey(106));//true
	   System.out.println(hm.containsKey(101));//false
	   
	   
	   System.out.println(hm.containsValue("nitsh"));//true
	   System.out.println(hm.containsValue("nitshe1"));//false
	   
	   System.out.println(hm.remove(105));
	   System.out.println(hm.remove(102, "rajesh"));
	   System.out.println(hm.remove("raj"));//not possible to delete data by value
	   
	   
	   System.out.println(hm);
	   System.out.println("************");
	   //is empty 
	   
	   System.out.println(hm.isEmpty());//false
	   System.out.println(hm1.isEmpty());//true
	   System.out.println("************");
	   
	   
	   System.out.println(hm.remove(106));
	   System.out.println(hm);
	   
	   System.out.println("************");
	   
	   System.out.println(hm.keySet());//[112, 120, 107, 111] gives key present in hashmap
	   System.out.println(hm.values());
	   System.out.println("************");
	   
	   for(Object obj:hm.keySet()) {
		   System.out.println(obj);
	   }
	   System.out.println("************");
	   for(Object obj1:hm.values()) {
		   System.out.println(obj1);
	   }
	   
	   System.out.println("************");
	   
	   
	  for(Object obj2:hm.keySet()) {
		  
		  System.out.println(obj2+" "+hm.get(obj2));
		                   //for key   //for value
	  }
	   
	  //Entry method
	  System.out.println("************");
	  for(Map.Entry entry:hm.entrySet()) {
		  
		  
		System.out.println(entry.getKey()+" "+entry.getValue());  
		  
		
	  }
	  System.out.println("************");
	  System.out.println("************");
	  //itarator
	  
	  Set s=hm.entrySet();	 
	  
	  Iterator it=s.iterator();
	  
	  while(it.hasNext()) {
		  
		  Map.Entry entry=(Entry) it.next();
		  
		  System.out.println(entry.getKey()+""+entry.getValue());
	  }
	   
	   
	   
	   
	    
	}
}

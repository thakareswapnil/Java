package vector;

import java.util.Vector;

public class vector1 {
	public static void main(String[] args) {
		Vector<Comparable> v1=new Vector<Comparable>();
		
		Vector <String> v2=new Vector<String>();
		
		
		v1.add(12);
		v1.add(13);
		v1.add(14);
		v1.add(15);
		v1.add(16);
		v1.add(17);
		v1.add("aaa");
		v1.add("bbb");
		v1.add("kkkk");
		v1.add("hhh");
		
		System.out.println(v1);
		
		
		System.out.println(v1.size());
		
		//remove
		
		System.out.println(v1.remove(5));
		
		
		
	}

}

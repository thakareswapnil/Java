package Methodd;

public class Method_in_Same_Class {
	
	
	public   void Studentinfo(String name) {
		
		System.out.println(name+"  is student");
		
	}

	public static void main(String[] args) {
		Method_in_Same_Class ss=new Method_in_Same_Class();
		ss.Studentinfo("Swapnil");

	}

}

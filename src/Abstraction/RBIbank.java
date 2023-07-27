package Abstraction;

public abstract class RBIbank {

	public void Loan() {
		System.out.println("loan of rbi");
		
	}
	public abstract void Debitcard();
	 
	
	public  abstract void Creditcard();
	
}


  class Axis extends RBIbank{

	@Override
	public void Debitcard() {
	System.out.println("Debitcard of axis ");
		
	}

	@Override
	public void Creditcard() {
		System.out.println("crebitcard of axis ");
		
	}
	public static void main (String args[]) {
		Axis a=new Axis ();
	}
	 
 }

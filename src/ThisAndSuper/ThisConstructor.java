package ThisAndSuper;
//Example of this and super keyword in java


class Subclass
{
	public Subclass()
	{ this(5); 
		System.out.println("1 st con");
	}
	public Subclass(int u) 
	{   
		this(3,5);
		System.out.println("2 st con");
	}
    public Subclass(int y,int j)
    {
    	
	System.out.println("3 st con");
    }
}

public class ThisConstructor extends Subclass {
	public ThisConstructor() {
		super();//this goes into parent class constructor 
	}

	public static void main(String[] args) {
		ThisConstructor th=new ThisConstructor();
		
	}

}
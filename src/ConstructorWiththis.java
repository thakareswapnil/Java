
public class ConstructorWiththis {

	public ConstructorWiththis() 
	{
		this(1);
		System.out.println("1 st con");

	}
	public ConstructorWiththis(int i) 
	{
		this(1,2);
		System.out.println("2 st con");

	}public ConstructorWiththis(int i,int j) 
	{
		System.out.println("3 st con");

	}
}
	

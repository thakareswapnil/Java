//no argument constuctor
public class WithParameter {
	int x;
	
	public WithParameter(int y) 
	{
		x=y;
		System.out.println("hii "+x);
	}

	public static void main(String[] args) {
		
		
		WithParameter con=new WithParameter(6);
		

	}

}

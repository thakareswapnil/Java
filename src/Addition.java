
public class Addition {
  int x,y;
  int sum;
  public Addition(int x,int y)
  {
	 sum=x+y;
	 // System.out.println("addition is "+sum);
	  
  }
	public static void main(String[] args) {
		Addition con =new Addition(100,120 );
		System.out.println(con.sum);

	}

}

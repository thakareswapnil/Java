
public class MethodAndConstructor {
	int num1,num2;
	
	public MethodAndConstructor(int num3,int num4) {
		num1=num3;
		num2=num4;
		
	}
  public void addition() {
	  int sum=num1+num2;
	  System.out.println(sum);
  }
	public static void main(String[] args) {
		MethodAndConstructor con=new MethodAndConstructor(20,20);
		MethodAndConstructor con1=new MethodAndConstructor(40,20);
		con.addition();
        con1.addition();
	}

}

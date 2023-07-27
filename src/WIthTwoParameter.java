//parameterized constructor
public class WIthTwoParameter {
	int modelyear;
	String modelname;
	
	public WIthTwoParameter(int year,String name) {
		//System.out.println("model year is "+year+ " model name is "+name);
	modelyear=year;
	modelname=name;
	}
	

	public static void main(String[] args) {
		WIthTwoParameter con=new WIthTwoParameter(1995, "urus");
		System.out.println(con.modelyear+" "+con.modelname);

	}

}

package Encapsulation;

public class Empdata {

	public static void main(String[] args) {
		EmployeeData1 emp=new EmployeeData1();
		emp.setempname("rahotfdjalsjk");
		emp.setempage(2127);
		emp.setempid(3456);
		System.out.println("empname-->"+emp.getempname());
		System.out.println("empid-->"+emp.getempid());
		System.out.println("empage-->"+emp.getempage());

	}

}

package Encapsulation;

public class EmployeeData1 {

	private String empname;
	private int empid;
	private int empage;

	public static void main(String[] args) {
		EmployeeData1 emp=new EmployeeData1();
		emp.setempname("rahot");
		emp.setempage(27);
		emp.setempid(123456);
		System.out.println("empname-->"+emp.getempname());
		System.out.println("empid-->"+emp.getempid());
		System.out.println("empage-->"+emp.getempage());

	}

	public String getempname() {
		return empname;
	}
	public void setempname(String empname) {
		this.empname=empname;
	}

	public int getempid() {
		return empid;
	}

	public void setempid(int empid) {
		this.empid=empid;
	}
	public int getempage() {
		return empage;
	}
	public void setempage(int empage) {
		this.empage=empage;
	}
}

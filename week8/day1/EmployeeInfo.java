package week8.day1;

public class EmployeeInfo {
	String empName;
	int empId;
	boolean empStatus;
	
	public EmployeeInfo() {
		this("Hari",123,true);// call the parameterized constructor
		System.out.println("I am a default constructor");
	}
	
	public EmployeeInfo(String empName, int empId, boolean empStatus) {
		System.out.println("I am a parameterized constructor");
		this.empName = empName;
		this.empId = empId;
		this.empStatus = empStatus;
	}

	public static void main(String[] args) {
	// ClassName objectName	= new Constructor
		EmployeeInfo emp1 = new EmployeeInfo();
		
		System.out.println(emp1.empName+" "+emp1.empId+emp1.empStatus);

	}

}

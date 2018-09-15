package lti.emp;

public abstract class Employee {
	private int empNo;
	private String empName;
	private double salary;

	private static int autogen;

	static { // static initializer block - executes @ time of class loading
		System.out.println("employee class loaded....");
		autogen = 1001;
	}

	public Employee() {

	}

	public Employee(String empName, double salary) {

		this.empNo = autogen++;
		this.empName = empName;
		this.salary = salary;
	}

	public void payslip() {
		System.out.println("Emp no:" + empNo);
		System.out.println("Emp name:" + empName);
		System.out.println("salary:" + salary);
	}

	public double getSalary() {
		return salary;
	}

}

package lti.emp;

public class Manager extends Employee {
	private double incentive;

	public Manager() {
	}

	public Manager(String empName, double salary, double incentive) {
		super(empName, salary);
		this.incentive = incentive;
	}

	@Override
	public void payslip() {
		super.payslip();
		System.out.println("incentive:" + incentive);
	}

	@Override
	public double getSalary() {

		return super.getSalary() + incentive;
	}

}

package Sam;

public class TestEmployee {
	public static void main(String[] args) {
		Employee d10 = () -> 10;  //lambda expressions
		d10.showDepartment();
		Employee d20 = () -> 20;
		d20.showDepartment();
	}
}

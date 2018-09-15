import lti.emp.Employee;
import lti.emp.Executive;
import lti.emp.Manager;

public class TestEmployee {
		public static void main(String[] args) {
			Executive exec = new Executive("Lily", 7000, 2000);
			exec.payslip();
			Manager mgr=new Manager("Jon", 8000, 600);
			mgr.payslip();
			showSalary(exec);
			showSalary(mgr);
			
		}

		private static void showSalary(Employee emp) {
			if(emp instanceof Manager) //RTTI run time type interface
				System.out.println("manager salry:"+emp.getSalary());
			else
				System.out.println("executive salary:"+emp.getSalary());			
		}

		/*private static void showSalary(Manager mgr) {
			System.out.println("manager salry:"+mgr.getSalary());
		}

		private static void showSalary(Executive exec) {
			System.out.println("executive salary:"+exec.getSalary());
		}*/

	}



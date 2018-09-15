package lti.bank;

public class TestAccount {

	public static void main(String[] args) {
		/*
		 * Savings s1=new Savings("Polo"); s1.summary(); s1.withdraw(500);
		 * s1.deposit(2000); s1.summary();
		 */

		/*Current c1 = new Current("Polo");
		c1.summary();
		c1.withdraw(3000);
		c1.summary();
		c1.withdraw(7000);
		c1.summary();

		c1.deposit(2000);
		c1.summary();
		c1.deposit(5000);
		c1.summary();*/
		
		//Savings s1=new Savings("Polo");
		Bank s1=AccountFactory.openAccount("Polo", "savings");
		s1.deposit(2000);
		try {
			s1.withdraw(15000);
		} catch (BalanceException e) {
			System.out.println(e.getMessage());
			System.out.println(e); //logging for audit purpose
			e.printStackTrace(); //developers for trouble shooting
		}
		s1.deposit(1000);
		s1.statement();

	}

}

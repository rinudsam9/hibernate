package lti.bank;
public class Savings extends Account {

	public Savings(String holder) {
		super(holder, MIN_SAV_BAL);
	}

	@Override
	public void withdraw(double amount) throws BalanceException {
		if (amount <= (getBalance() - MIN_SAV_BAL)) {
			setBalance(getBalance() - amount);
		txns.add(new Transaction("debit",getBalance(),getBalance()));
	}
		else
			throw new BalanceException("insufficient funds");
		
		
	}

}

package lti.bank;
public class Current extends Account {
	private double od;

	public Current(String holder) {
		super(holder, INIT_CUR_BAL);
		od = OVERDRAFT_VALUE;
		// System.out.println("overdraft:"+od);

	}

	@Override
	public void deposit(double amount) {
		od += amount;
		if (od > OVERDRAFT_VALUE) {
			setBalance(getBalance() + (od - OVERDRAFT_VALUE));
			od = OVERDRAFT_VALUE;
		}
		txns[idx++]=new Transaction("",getBalance(),getBalance());

		// System.out.println("overdraft:"+od);
	}

	@Override
	public void withdraw(double amount) throws BalanceException {
		if (amount <= od + getBalance()) {
			setBalance(getBalance() - amount);
		}
		if (getBalance() < MIN_CUR_BAL) {
			od += getBalance();
			setBalance(MIN_CUR_BAL);
		}
		txns[idx++]=new Transaction("",getBalance(),getBalance());
	
}
	// System.out.println("overdraft:"+od);

	@Override
	public void summary() {
		super.summary();
		System.out.println("overdraft" + od);
	}
}
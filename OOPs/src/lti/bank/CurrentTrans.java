package lti.bank;
public class CurrentTrans extends Transaction {
	private String transType;
	private double amount,balance;
	private double overdraft;
	 
	public CurrentTrans() {
		
	}

	public CurrentTrans(String transType, double amount, double balance, double overdraft) {
		this.transType = transType;
		this.amount = amount;
		this.balance = balance;
		this.overdraft = overdraft;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("overdraft"+overdraft);
	}

	
}

package lti.bank;

import java.util.ArrayList;
import java.util.Vector;

/**
 * This is a generalised account class.
 * 
 * @author Aayushi
 * @version 1.0
 */
public abstract class Account implements Bank {
	private int actno;
	private String holder;
	private double balance;
	private static int autogen = INIT_ACNT_NO;
	protected Vector<Transaction> txns;// declaring transaction array
	// ArrayList<Transaction> new_txn=new ArrayList<>();
	protected int idx;

	/** Default constructor */
	public Account() {

	}

	public Account(String holder, double balance) {
		this.actno = autogen++;
		this.holder = holder;
		this.balance = balance;

		txns = new Vector<>();// instantiating transaction array of 5
		// adding opening account transaction into array

		/*
		*/
		// txns[idx++] = new Transaction("opening", balance, balance);\
		txns.add(new Transaction("opening", balance, balance));
	}

	/** method to display account summary */
	public void summary() {
		System.out.println("A/C no:" + actno);
		System.out.println("Holder:" + holder);
		System.out.println("Balance:" + balance);

	}

	// BL methods
	public void deposit(double amount) {
		balance += amount;
		txns.add(new Transaction("credit", amount, balance));

	}

	// public abstract void withdraw(double amount);
	/*
	 * { if (amount <= balance) balance -= amount; else
	 * System.out.println("Insufficient funds!"); }
	 */

	public void statement() {
		System.out.println("Account statement:" + actno);
		System.out.println("Type\t Amount\t Balance");
		/*
		 * for (int i = 0; i < idx; i++) txns[i].print();
		 */
		for (Transaction elem : txns)
			elem.print();

	}

	// balance interface
	public double getBalance() {
		return balance;
	}

	protected void setBalance(double balance) {
		this.balance = balance;
	}

}

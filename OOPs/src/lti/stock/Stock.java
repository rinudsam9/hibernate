package lti.stock;

public class Stock implements Exchange {

	@Override
	public void getQuote() {
		System.out.println("get quote");
	}

	@Override
	public void viewQuote() {
		System.out.println("view quote");

	}

	@Override
	public void setQuote() {
		System.out.println("set quote");
	}
}

package lti.stock;

public class StockSingleton {
	private StockSingleton() {

	}

	private static Stock stock;

	public static Stock getStock() {
		if (stock == null)
			stock = new Stock();
		return stock;
	}

}

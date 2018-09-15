
public class Product {
	private String prodname;
	private double price;
	private double stock;
	private double total;

	public Product() {
	}

	public Product(String prodname, double price, double stock) {
		super();
		this.prodname = prodname;
		this.price = price;
		this.stock = stock;
	}

	public String getProdname() {
		return prodname;
	}

	public void setProdname(String prodname) {
		this.prodname = prodname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getStock() {
		return stock;
	}

	public void setStock(double stock) {
		this.stock = stock;
	}

	public void print() {

		System.out.println(prodname + "\t" + price * stock);
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
}

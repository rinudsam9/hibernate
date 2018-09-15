
public class Cart extends Product {

	Product[] products;
	int id;
	double price;
	double stock;
	double total;
	String prodname;

	public Cart(String prodname, double price, double stock) {
		super(prodname, price, stock);
		this.prodname = prodname;
		this.price = price;
		this.stock = stock;
		products = new Product[5];

	}

	public void addProduct(String prodname, double price, double stock) {

		products[id++] = new Product(prodname, price, stock);

	}

	public void showCart() {
		for (int i = 0; i < id; i++) {
			// products[i].print();
			System.out.println(products[i].getProdname() +"\t"+ products[i].getPrice() * products[i].getStock());
			total += products[i].getPrice() * products[i].getStock();
		}
		System.out.println("Total " + total);

	}

	public void removeCart() {
if(Prodname==null)
	}

}
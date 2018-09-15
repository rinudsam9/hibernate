
public class TestCart {
	public static void main(String[] args) {

		Cart c1 = new Cart("kitkat", 20, 8);
		c1.addProduct("Snickers", 50, 3);
		c1.addProduct("cadbury", 20, 1);
		c1.addProduct("mug", 90, 2);
		c1.addProduct("Soap", 20, 3);
		c1.showCart();
	}
}
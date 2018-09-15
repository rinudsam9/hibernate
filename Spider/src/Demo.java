
public class Demo<A> {
	private A data;

	public Demo(A data) {
		this.data = data;
	}

	public A getData() {
		return data;
	}

	public void setData(A data) {
		this.data = data;
	}

	public static void main(String[] args) {
		Demo<String> d1 = new Demo<String>("hello");
		d1.setData(1000);
		Demo<Integer> d2 = new Demo<Integer>(500);
		d2.setData("bye");
	}
}

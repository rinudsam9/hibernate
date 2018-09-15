
public class MyRunnable implements Runnable {
	private int data;

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for (int c = 1; c <= 50; c++)
			System.out.println(name + ":" + ++data);
	}

	public static void main(String[] args) {
		MyRunnable mr = new MyRunnable();   //multiple threads on a single data so there is possibility of data loss
		Thread t1 = new Thread(mr, "Alfa");
		Thread t2 = new Thread(mr, "Bravo");
		Thread t3 = new Thread(mr, "MArio");
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);

		t1.start();
		t2.start();
		t3.start();
	}

}

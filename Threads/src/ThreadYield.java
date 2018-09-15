
public class ThreadYield {
	class HelloThread extends Thread {

		@Override
		public void run() {
			while (true) {
				System.out.println("hello");
				yield();
			}
		}

	}

	class WorldThread extends Thread {
		@Override
		public void run() {
			while (true) {
				System.out.println("world");
				yield();
			}
		}
	}

	public static void main(String[] args) {
		ThreadYield yield = new ThreadYield();
		HelloThread hello = yield.new HelloThread();
		WorldThread world = yield.new WorldThread();

		hello.start();
		world.start();
	}
}
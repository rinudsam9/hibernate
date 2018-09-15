
public class EventDemo implements Event {

	@Override
	public void doSomething() {
		System.out.println("First event");
	}

	static class EventImpl implements Event {

		@Override
		public void doSomething() {
			System.out.println("Second event");
		}

	}

	public void doingSomething() {
		class InnerEventImpl implements Event {

			@Override
			public void doSomething() {
				System.out.println("Third event");
			}

		}
		;

		Event e = new InnerEventImpl();
		e.doSomething();
	}

	public void doingSomethingAgain() {
		Event e = new Event() {

			@Override
			public void doSomething() {
				System.out.println("Fourth event");

			}

		};
		e.doSomething();
	}

	public void doinSomethingLastTime() {
		Event e = () -> System.out.println("Fifth event");
		e.doSomething();
	}

	public static void main(String[] args) {
		EventDemo demo = new EventDemo();
		demo.doSomething();

		// EventImpl impl = demo.new EventImpl()
		EventImpl impl = new EventDemo.EventImpl();
		impl.doSomething();
		demo.doingSomething();
		demo.doingSomethingAgain();
		demo.doinSomethingLastTime();
	}

}

package Sam;

public class TestHello {

	public static void main(String[] args) {

		Hello h = new Hello() { // has no parent class so it extends objectclass so it can access object
								// methods. should have one abstract mthod

			@Override
			public String sayHello(String name) {

				return "Hello" + name;
			}

		};
		System.out.println(h.sayHello("Azaaa"));
		System.out.println(h.toString());
		Hello hi = (name) -> "Hola" + name;
		System.out.println(hi.sayHello("Azaaa"));
		System.out.println(hi);
		Hello.greet();
		h.seeOff();

	}

}

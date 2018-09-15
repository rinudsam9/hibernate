package Sam;

@FunctionalInterface
public interface Hello {
	String sayHello(String hello);

	String toString();

	static void greet() {
		System.out.println("howdy");
	}

	default void seeOff() {
		System.out.println("hasta la vista");
	}

}

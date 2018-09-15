
public interface MyInterface {
	static void sayHello(String name) {
		System.out.println("HEllo" + name);
	}

	default void sayGoodBye(String name) {
		System.out.println("Goodbye" + name);
	}
}

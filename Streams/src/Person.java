import java.io.Serializable;

public class Person implements Serializable {
	private String name;
	private int age;

	public Person() {

	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Name: " + name + "\tAge: " + age;
	}

}
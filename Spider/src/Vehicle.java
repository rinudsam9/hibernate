
public class Vehicle {
	private String model;
	private String[] features;

	public Vehicle(String model, String... features) { // var -args
		this.model = model;
		this.features = features;
	}

	public void specs() {
		System.out.println("features of:" + model);
		for (String f : features)
			System.out.println(f);
	}

	public static void main(String[] args) {
		Vehicle alto = new Vehicle("Alto", "Power steering", "Power window");

		Vehicle jazz = new Vehicle("Jazz", "ABS", "Pano roof", "Keyless", "Airbags", "Cruise");
		alto.specs();
		jazz.specs();
	}
}

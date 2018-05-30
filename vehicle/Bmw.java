package vehicle;

public class Bmw implements Vehicle {

	@Override
	public void drive() {
		System.out.println("Bmw is driving");

	}

	@Override
	public void accelerate() {
		System.out.println("Bmw is going faster");


	}

	@Override
	public void brake() {
		System.out.println("Bmw is going to brake");
	}

}

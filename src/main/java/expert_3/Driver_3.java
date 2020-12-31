package expert_3;

public class Driver_3 {

	public static void main(String[] args) {
		
		Tire tire = new KoreaTire();
		
		Car car = new Car();
		
		car.setTire(tire);
		
		System.out.println(car.getTireBrand());
	}
}

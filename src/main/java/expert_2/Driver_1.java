package expert_2;

public class Driver_1 {

	
	public static void main(String[] args) {
		
		Tire tire = new AmericaTire();
		
		Car car = new Car(tire);
		
		System.out.println(car.getTireBrand());
	}
	
	
	
}

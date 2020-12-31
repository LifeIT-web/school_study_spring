package expert_33;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import expert_3.AmericaTire;
import expert_3.Car;
import expert_3.KoreaTire;
import expert_3.Tire;

public class CarTest3 {

	@Test
	public void koreaTireTest() {
		Tire tire1 = new KoreaTire();
		
		Car car1 = new Car();
		
		car1.setTire(tire1);
		
		assertEquals("장착된 타이어 : 코리아 타이어", car1.getTireBrand());
	}
	
	@Test
	public void americaTireTest() {
		Tire tire2 = new AmericaTire();
		
		Car car2 = new Car();
		
		car2.setTire(tire2);
		
		assertEquals("장착된 타이어 : 미국 타이어", car2.getTireBrand());
	}
}

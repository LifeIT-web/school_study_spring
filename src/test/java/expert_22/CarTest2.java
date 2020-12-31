package expert_22;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import expert_2.AmericaTire;
import expert_2.Car;
import expert_2.KoreaTire;
import expert_2.Tire;

public class CarTest2 {

	@Test
	public void 자동차_코리아타이어장착_타이어브랜드_테스트() {
		Tire tire1 = new KoreaTire();
		Car car1 = new Car(tire1);
		
		assertEquals("장착된 타이어 : 코리아 타이어", car1.getTireBrand());
		
	}
	
	@Test
	public void 자동차_미국타이어장착_타이어브랜드_테스트() {
		Tire tire2 = new AmericaTire();
		Car car2 = new Car(tire2);
		
		assertEquals("장착된 타이어 : 미국 타이어", car2.getTireBrand());
		
	}
}

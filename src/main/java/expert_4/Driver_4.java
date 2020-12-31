package expert_4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver_4 {

	public static void main(String[] args) {
		ApplicationContext context = 
					new ClassPathXmlApplicationContext("expert_4/expert_004.xml");
		
		Car car = context.getBean("car", Car.class);
		
		Tire tire = context.getBean("parisTire", Tire.class);
		
		car.setTire(tire);
		
		System.out.println(car.getTireBrand());
		
		
	}
}

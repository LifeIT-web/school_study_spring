package expert_5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver_5 {

	public static void main(String[] args) {
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("expert_5/expert_005.xml");
		
		Car car = context.getBean("car", Car.class);
		
		System.out.println(car.getBrandTire());
		
				
	}
}

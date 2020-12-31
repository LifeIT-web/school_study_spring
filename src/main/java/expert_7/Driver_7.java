package expert_7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver_7 {

	public static void main(String[] args) {
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("expert_7/expert_007.xml");
		
		Car car = context.getBean("car", Car.class);
		
		System.out.println(car.getTireBrand());
		
		
	}
}

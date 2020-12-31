package expert_6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver_6 {

	public static void main(String[] args) {
		
		ApplicationContext context =
				new ClassPathXmlApplicationContext("expert_6/expert_006.xml");
		
		Car car = (Car)context.getBean("car");
		
		System.out.println(car.getTireBrand());
	}
}

package aop_02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start_2 {

	public static void main(String[] args) {
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("aop_02/aop002.xml");
		
		Person king1 = context.getBean("man" , Person.class);
		Person queen1 = context.getBean("woman", Person.class);
		
		king1.runSomething();
		System.out.println();
		queen1.runSomething();
		
	}
}

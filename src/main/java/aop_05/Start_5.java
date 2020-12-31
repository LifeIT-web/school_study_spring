package aop_05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start_5 {

	public static void main(String[] args) {
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("aop_05/aop005.xml");
		
		Person king = context.getBean("man", Person.class);
		Person queen = context.getBean("woman", Person.class);
		
		System.out.println("\n\n");
		
		king.runSomething();
		System.out.println();
		queen.runSomething();
		
	}
}

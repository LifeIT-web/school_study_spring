package aop_06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start_6 {

	public static void main(String[] args) {
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("aop_06/aop006.xml");
		
		Person king = context.getBean("man", Person.class);
		Person queen = context.getBean("woman", Person.class);
		
		System.out.println("\n\n");
		
		king.runSomething();
		System.out.println();
		queen.runSomething();
	}
}

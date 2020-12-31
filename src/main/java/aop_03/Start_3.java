package aop_03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start_3 {

	public static void main(String[] args) {
		
		ApplicationContext context =
				new ClassPathXmlApplicationContext("aop_03/aop003.xml");
		
		Person king = (Person)context.getBean("man");
		Person queen = (Person)context.getBean("woman");
		
		
		System.out.println("\n\n");
		
		king.runSomething();
		System.out.println();
		queen.runSomething();
	}
}

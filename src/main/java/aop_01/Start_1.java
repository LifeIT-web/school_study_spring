package aop_01;

public class Start_1 {

	public static void main(String[] args) {
		
		Man_1 king = new Man_1();
		Woman_1 queen = new Woman_1();
		
		king.runSomething();

		System.out.println();
		
		queen.runSomething();
	}
}

package templateMethodPattern;

public class Dog extends Animal{

	@Override
	void play() {

		System.out.println("멍! 멍! 멍! 뭐!");
	}
	
	void runSomething() {
		System.out.println("멍! 머! 뭐! 꼬리 살랑!");
	}
	
}

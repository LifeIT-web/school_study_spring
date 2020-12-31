package templateMethodPattern;

public abstract class Animal {

	// 템플릿 메소드
	
	public void playWithOwner() {
		System.out.println("귀염둥이 이리온!!!!");
		play();
		runSomething();
		
		System.out.println("굿 잘했으!!!!!");
	}
	
	// 추상 메소드
	
	abstract  void play();
	
	// Hook 메소드
	
	void runSomething() {
		System.out.println("꼬리 살랑살랑 !!!!!!");
	}
}

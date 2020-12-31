package aop_03;

public class Woman_3 implements Person{

	@Override
	public void runSomething() {
		
		System.out.println("열쇠로 문을 열고 들어간다.~~~~~");
		
		try {
			System.out.println("요리을 한다.!!!!");
			
		} catch (Exception e) {
			if (e.getMessage().equals("화장품이 떨어짐")) {
				System.out.println("화를 낸다.");
				
			}
			
		} finally {
			System.out.println("불을 끄고 잔다 %%%%%%");
		}
		
		System.out.println("문을 열고 나간다 자물쇠로 문을 잠근다.");
	}
}

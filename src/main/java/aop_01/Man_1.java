package aop_01;

public class Man_1 {

	public void runSomething()
	{
		System.out.println("열쇠로 문을 열고 들어간다.~~~~~");
		
		try {
			System.out.println("게임을 한다.!!!!");
			
		} catch (Exception e) {
			if (e.getMessage().equals("전선에 불남")) {
				System.out.println("119 신고를 한다.");
				
			}
			
		} finally {
			System.out.println("불을 끄고 잔다 %%%%%%");
		}
		
		System.out.println("문을 열고 나간다 자물쇠로 문을 잠근다.");
	}
}

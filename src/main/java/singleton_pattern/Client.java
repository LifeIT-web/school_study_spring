package singleton_pattern;

public class Client {

	public static void main(String[] args) {
		
		// private 생성자 이므로 new 할 수 없다.
		// Single single = new Single();
		
		Singleton ss1 = Singleton.getInstance();
		Singleton ss2 = Singleton.getInstance();
		Singleton ss3 = Singleton.getInstance();
		Singleton ss4 = Singleton.getInstance();
		
		System.out.println(ss1);
		System.out.println(ss2);
		System.out.println(ss3);
		System.out.println(ss4);
		
		ss1 = null;
		ss2 = null;
		ss3 = null;
		ss4 = null;
		
		System.out.println(ss1);
		System.out.println(ss2);
		System.out.println(ss3);
		System.out.println(ss4);
		
		
	}
}

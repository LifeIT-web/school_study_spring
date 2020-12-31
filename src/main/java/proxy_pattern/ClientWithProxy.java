package proxy_pattern;

public class ClientWithProxy {

	public static void main(String[] args) {
		// 프록시를 이용한 호출
		// 프록시는 대리자 대변인이라는 뜻을 가진다.
		// 다른 누군가를 대신해 그 역할을
		// 수행하는 존재를 말함.
		
		
		IService proxy = new Proxy();
		
		System.out.println(proxy.runSomething());
	}
}

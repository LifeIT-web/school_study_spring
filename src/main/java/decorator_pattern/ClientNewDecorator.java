package decorator_pattern;

public class ClientNewDecorator {

	public static void main(String[] args) {
		
		Service service = new Service();
		
		System.out.println(service.runSomething());
	}
}

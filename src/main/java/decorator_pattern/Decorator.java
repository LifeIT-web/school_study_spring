package decorator_pattern;

public class Decorator implements IService{

	IService service;
	
	@Override
	public String runSomething() {

		System.out.println("흐름에 대한 장식이 주목적, " + " 클라이언트에 반환 결과에 장식을 더하여 전달");
		
		service = new Service();
				
		return "" + service.runSomething();
	}
	
}

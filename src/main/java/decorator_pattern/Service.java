package decorator_pattern;

public class Service implements IService{

	@Override
	public String runSomething() {
		return "비가 오고 바람부는 화요일 아침에";
	}
}

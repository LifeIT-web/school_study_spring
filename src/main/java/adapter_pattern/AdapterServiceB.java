package adapter_pattern;

public class AdapterServiceB {

	ServiceB sa2 = new ServiceB();
	
	void runService() {
		sa2.runServiceB();
	}
}

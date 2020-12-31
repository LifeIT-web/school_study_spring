package strategy_pattern;

public class Client {

	public static void main(String[] args) {
		
		Strategy strategy = null;
		
		Soldier rambo = new Soldier();
		
		// 총을 람보에게 전달하여 전투를 수행한다.

		strategy = new StrategyGun();
		rambo.runContext(strategy);
		
		// 검을 람보에게 전달하여 전투를 수행한다.
		
		strategy = new StrategySword();
		rambo.runContext(strategy);
		
		// 활을 람보에게 전달하여 전투를 수행한다.
		
		strategy = new strategyBow();
		rambo.runContext(strategy);
	}
}

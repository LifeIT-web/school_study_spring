package expert_6;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {

	@Autowired
	Tire tire;
	
	// @Autowired 를 통해 Car의 property 를 자동으로 엮어 줄수
	// 있으므로(자동 의존성 주입(DI)) 생략이 가능하다.
	
	public String getTireBrand() {
		return "장착된 타이어 : " + tire.getBrand();
	}
}

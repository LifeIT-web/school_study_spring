package expert_7;

import javax.annotation.Resource;

public class Car {

	// @Autowired
	// @Qualifier("tire11")
	
	@Resource(name="tire22")
	Tire tire;
	
	public String getTireBrand() {
		return "장착된 타이어 : " + tire.getBrand();
	}
	
}

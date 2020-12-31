package expert_5;

public class Car {

	Tire tire;

	public Tire getTire() {
		return tire;
	}

	public void setTire(Tire tire) {
		this.tire = tire;
	}
	
	public String getBrandTire() {
		return "장착된 타이어 : " + tire.getBrand();
	}
	
}


public class Car {
	private int yearModel;
	private String make;
	private int speed;
	
	public Car() {
		this.yearModel = 2000;
		this.make = "Nissan";
		this.speed = 4;
	}
	
	public Car(int yearModel, String make, int speed) {
		this.yearModel = yearModel;
		this.make = make;
		this.speed = speed;
	}

	public int getYearModel() {
		return yearModel;
	}

	public void setYearModel(int yearModel) {
		this.yearModel = yearModel;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	@Override
	public String toString() {
		String CarInfo = "Year Model: " + this.yearModel
				+ "\n Make: " + this.make
				+ "\n Speed: " + this.speed;
		return CarInfo;
	}
	
}

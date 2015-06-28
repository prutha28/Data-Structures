package cars;

public class Car {

	private int carNumber ;
	private String carColor;
	private String carMake ;
	private Integer numberOfWheels ;
	
	public Car() {
		super();
	}

	public Car (int carNumber, String carColor, String carMake,
			Integer numberOfWheels) {
		super();
		this.carNumber = carNumber;
		this.carColor = carColor;
		this.carMake = carMake;
		this.numberOfWheels = numberOfWheels;
	}
	
	public int getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	public String getCarMake() {
		return carMake;
	}
	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}
	public Integer getNumberOfWheels() {
		return numberOfWheels;
	}
	public void setNumberOfWheels(Integer numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
	
}

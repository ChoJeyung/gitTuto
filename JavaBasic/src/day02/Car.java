package day02;

//필드: 차량 번호, 차량 종류, 차량 색깔, 최고속도, 연비
//메소드: 생성자, getter/setter, 출발, 정지, toString()
public class Car {
	private String number;
	private String type;
	private String color;
	private int maxSpeed;
	private double fuelRate;
	
	public Car() {
		number = "";
		type = "";
		color = "";
		maxSpeed = 0;
		fuelRate = 0;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public double getFuelRate() {
		return fuelRate;
	}

	public void setFuelRate(double fuelRate) {
		this.fuelRate = fuelRate;
	}
	
	public void start() {
		System.out.println("start");
	}
	public void stop() {
		System.out.println("stop");
	}

	@Override
	public String toString() {
		return "Car [number=" + number + ", type=" + type + ", color=" + color + ", maxSpeed=" + maxSpeed
		        + ", fuelRate=" + fuelRate + "]";
	}
	
}






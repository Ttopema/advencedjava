package assignment;

public class Taxi extends Car {
	private int taxifare;

	// 기본생성자
	public Taxi() {

	}
	
	public Taxi(Point point, int speed) {
		super(point, speed);
	}


	//get,set메소드
	public int getTaxifare() {
		return taxifare;
	}

	public void setTaxifare(int taxifare) {
		this.taxifare = taxifare;
	}
	
	

	@Override
	public void run(int hour) {
		distance += hour;
	}

	@Override
	public double calcToll() {
		double fee = distance * taxifare * 0.023;
		return fee;
	}

	@Override
	public void print() {
		
	}

}

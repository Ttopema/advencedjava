package assignment;

public class Truck extends Car {
	private int weight;

	// 기본생성자
	public Truck() {

	}

	public Truck(Point point, int speed) {
		super(point, speed);
	}

	//get,set메소드
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	
	@Override
	public void run(int hour) {

	}

	@Override
	public double calcToll() {
		return 0;
	}

	@Override
	public void print() {

	}

}

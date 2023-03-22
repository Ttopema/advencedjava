package assignment;

public abstract class Car {
	private Point point;
	private int speed;
	protected double distance;

	//기본생성자
	public Car() {
		
	}
	
	//매개변수 2개인 생성자
	public Car(Point point, int speed) {
		super();
		this.point = point;
		this.speed = speed;
	}
	
	public abstract void run(int hour);
	
	public abstract double calcToll();
	
	public abstract void print();
	
	public static void printTitle() {
		System.out.println("차종\tspeed  distance\tx좌표\ty좌표   요금");
	}
	
	//get,set메소드
	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}
	
	
	
}

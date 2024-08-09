package chatgprlearning;
// Just creating class and object
public class Car {
	String color;
	String model;
	
	void drive() {
		System.out.println("Im driving "+color+" color "+model+" model car.");
	}
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.color = "red";
		myCar.model = "Tesla X";
		myCar.drive();
	}
}

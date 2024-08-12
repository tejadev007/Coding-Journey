package practice;

public class Car {
	String name;
	int age;
	
	void details() {
		System.out.println("Name is "+name+" and age is "+age);
	}
	
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.name = "Tesla";
		myCar.age = 20;
		myCar.details();
	}
}

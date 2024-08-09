package chatgprlearning;
// Normal inheritance example
class Animal{
	void eats() {
		System.out.println("This is a animal");
	}
}
class Dog extends Animal{
	void name() {
		System.out.println("This animal name is Dog");
	}
}
public class BasicInheritance {
	public static void main(String[] args) {
		Dog myDog = new Dog();
		myDog.eats();
		myDog.name();
	}
}

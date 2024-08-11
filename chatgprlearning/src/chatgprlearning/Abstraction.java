package chatgprlearning;

abstract class Animal26 {
	abstract void makeSound();
	
	void sleep() {
		System.out.println("Animal is Sleeping");
	}
}

class Dog26 extends Animal26 {
	@Override
	void makeSound() {
		System.out.println("Dog is barking");
	}
}

class Cat26 extends Animal26 {
	@Override
	void makeSound() {
		System.out.println("Cat is making meow sound");
	}
}

public class Abstraction {
	public static void main(String [] args) {
		Animal26 myDog = new Dog26();
		Animal26 myCat = new Cat26();
		
		myDog.makeSound();
		myDog.sleep();
		
		myCat.makeSound();
		myCat.sleep();
	}
}

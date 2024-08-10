package chatgprlearning;

// Run time polymorphism

class Animal01 {
	void sound() {
		System.out.println("Animal makes a Sound");
	}
}

class Dog01 extends Animal01{
	@Override
	void sound() {
		System.out.println("Dog barks");
	}
}

class Cat01 extends Animal01 {
	@Override
	void sound() {
		System.out.println("Cat meows");
	}
}

//Compile time polymorphism

class Calculator {
	int add(int a, int b) {
		return a+b;
	}
	
	int add(int a, int b, int c) {
		return a+b+c;
	}
}
public class Polymorphism {
	public static void main(String[] args) {
		Animal01 myAnimal = new Animal01();
		Dog01 myDog = new Dog01();
		Cat01 myCat = new Cat01();	
		
		myAnimal.sound();
		myDog.sound();
		myCat.sound();
		
		Calculator c = new Calculator();
		System.out.println(c.add(10, 200)); 
		System.out.println(c.add(10, 2000, 30000));
	}
}

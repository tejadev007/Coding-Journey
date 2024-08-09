package chatgprlearning;

class Animal1 {
	public void eat() {
		System.out.println("This animal eats food.");
	}
}

class Mammal extends Animal1 {
	public void breathe() {
		System.out.println("This animal breathes air");
	}
}

class Dog1 extends Mammal {
	public void barks() {
		System.out.println("The dog barks");
	}
}

public class MultiLevelInheritance {
	public static void main(String[] args) {
		Dog1 d = new Dog1();
		d.eat();
		d.breathe();
		d.barks();
	}
	
}

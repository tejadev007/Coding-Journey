package chatgprlearning;

class Animal2{
	public void eat() {
		System.out.println("This animal eats");
	}
	
	public void sleep() {
		System.out.println("This animal sleeps");
	}
}

class Dog2 extends Animal2{
	public void barks() {
		System.out.println("This animal barks");
	}
}

class Cat extends Animal2{
	public void meow() {
		System.out.println("This animal meows");
	}
}

public class HierarchicalInheritance {
	public static void main(String[] args) {
		Dog2 dog = new Dog2();
		System.out.println("What dog can do?");
		dog.eat();
		dog.sleep();
		dog.barks();
		
		Cat cat = new Cat();
		System.out.println("What cat can do?");
		cat.eat();
		cat.sleep();
		cat.meow();
	}
}

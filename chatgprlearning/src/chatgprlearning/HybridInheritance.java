package chatgprlearning;

interface Animal23 {
	void eat();
}

interface bird {
	void fly();
}

class Sparrow implements Animal23, bird{
	public void eat() {
		System.out.println("Sparrow eats seeds");
	}
	
	public void fly() {
		System.out.println("Sparrow flies short distances");
	}
}

class penguin implements Animal23{
	public void eat() {
		System.out.println("penguin eats fish");
	}
	
	public void swim() {
		System.out.println("Penguin swims in water");
	}
}

public class HybridInheritance {
	public static void main(String[] args) {
		Sparrow s = new Sparrow();
		s.eat();
		s.fly();
		
		penguin p = new penguin();
		p.eat();
		p.swim();
	}
}

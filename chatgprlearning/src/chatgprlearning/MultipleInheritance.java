package chatgprlearning;

interface Vehicle {
	void start();
	void stop();
	
}

interface Electronic {
	void powerOn();
	void powerOff();
	}

public class MultipleInheritance implements Vehicle, Electronic {
	@Override
	public void start() {
		System.out.println("Electric car is starting");
	}
	
	@Override
	public void stop() {
		System.out.println("Eletric car is stopping");
	}
	
	@Override
	public void powerOn() {
		System.out.println("Eletric car is powered on");
	}
	
	@Override
	public void powerOff() {
		System.out.println("Electric car is powered off");
	}
	
	public static void main(String[] args) {
		MultipleInheritance mul = new MultipleInheritance();
			mul.start();
			mul.powerOn();
			mul.stop();
			mul.powerOff();
		
	}
	
	
}

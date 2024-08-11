package chatgprlearning;

class person {
	private String name;
	private int age;
	public person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age)
	{
		if(age > 0) {
			this.age = age;
		}
		else {
			System.out.println("Age must be positive");
		}
	}
	
}

public class Encapsulation {
	public static void main(String [] args) {
		person p = new person("teja", 26);

		System.out.println(p.getName());
		System.out.println(p.getAge());
		
		
		p.setAge(27);
		p.setName("rajesh");
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		
		p.setAge(-20);
	}
}

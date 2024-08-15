package practice;
import java.util.List;
import java.util.ArrayList;

public class BasicArrayListPractice {
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("pinapple");
		fruits.add("peach");
		
		System.out.println("fruits list: "+ fruits);
		System.out.println("first fruit: "+ fruits.get(0));
	}
}

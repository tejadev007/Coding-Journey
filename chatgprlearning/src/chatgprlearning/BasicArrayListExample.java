package chatgprlearning;
import java.util.ArrayList;
import java.util.List;

//Basic ArrayList Creation and Access

public class BasicArrayListExample {
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		
		System.out.println("fruits list :"+fruits);
		System.out.println("first fruit :"+fruits.get(0));
	}
}

/*
 * Explanation:

Import Statements: import java.util.ArrayList; and import java.util.List; are used to import the 
ArrayList and List classes from the java.util package.

List Initialization: List<String> fruits = new ArrayList<>(); 
creates an ArrayList object that can store String elements. 
List is an interface and ArrayList is a class that implements this interface.

Adding Elements: fruits.add("Apple");, fruits.add("Banana");, 
and fruits.add("Cherry"); add three String elements to the fruits list.

Printing List: System.out.println("Fruits List: " + fruits); prints the entire list.
Accessing an Element: System.out.println("First fruit: " + fruits.get(0)); 
accesses and prints the element at index 0 of the list (the first element).

*/
package practice;

import java.util.List;
import java.util.ArrayList;

public class BasicArrayListPractice2 {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(20);
		numbers.add(40);
		numbers.add(50);
		
		System.out.println("All numbers are "+ numbers);
		System.out.println("First number is "+ numbers.get(0));
	}
}

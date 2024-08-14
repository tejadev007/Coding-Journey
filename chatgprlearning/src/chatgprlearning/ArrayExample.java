package chatgprlearning;

public class ArrayExample {
	public static void main(String[] args) {
		int[] numbers = new int[5];
		
		numbers[0] = 20;
		numbers[1] = 30;
		numbers[2] = 40;
		numbers[3] = 50;
		numbers[4] = 60;
		
		
		System.out.println("Element at index 0 is "+numbers[0]);
		System.out.println("Element at index 1 is "+numbers[1]);
		System.out.println("Element at index 2 is "+numbers[2]);
		System.out.println("Element at index 3 is "+numbers[3]);
		System.out.println("Element at index 4 is "+numbers[4]);
		
		System.out.println("Printing all elements of array: ");
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println("Element at index "+ i + " is "+ numbers[i]);
		}
		
		int[] moreNumbers = {10, 20, 30, 40, 50};
		
		System.out.println("printing all elements of moreNumbers ");
		
		for(int num: moreNumbers) {
			System.out.println("Number :"+ num);
		}
	}
}

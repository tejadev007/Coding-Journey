package practice;

public class BasicArraypractice {
	public static void main(String[] args) {
		int[] numbers= new int[5];
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 4;
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		
//		int[] myNumbers = {1,2,3,4};
		
		for(int i = 0; i<numbers.length; i++) {
			System.out.println("Element at index "+i+" is: "+ numbers[i]);
		}
		
	}
}

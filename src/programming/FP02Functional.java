// Problem 1: Functional Approach: Print each elements from list on its own line
package programming;

import java.util.List;

public class FP02Functional {
	public static void main(String[] args) {
//		printAllNumbersInListStructured(List.of(12,9,13,4,6,2,4,12,15));
		
		List<Integer> numbers = (List.of(12,9,13,4,6,2,4,12,15));
//		printAllNumbersInListStructured(numbers);
//		printEvenNumbersInListStructured(numbers);
		printSquaresOfNumbersInListStructured(numbers);
	}
	
//	private static void print(int number) {
//		System.out.println(number);
//	}
	
	private static boolean isEven(int number) {
		return number%2 == 0;
	}
	
	
    // number -> number%2 == 0
	private static void printAllNumbersInListStructured(List<Integer> numbers) {
		// TODO Auto-generated method stub
		// [12,9,13,4,6,2,4,12,15]
		// 12
        numbers.stream()
//          .forEach(FP02Functional::print);
        .forEach(System.out::print);  // Method Reference
        
        
        // We write our Java Functional Program
        // Improving Java Functional Program With filter
		
	}
	
	
	private static void printEvenNumbersInListStructured(List<Integer> numbers) {
        numbers.stream()
//        .filter(FP02Functional::isEven)  // Filter - Only Allow Even Numbers
        .filter(number -> number%2 == 0) // Lambda Expression
        .forEach(System.out::print);  // Method Reference
		
	}
	
	private static void printSquaresOfNumbersInListStructured(List<Integer> numbers) {
        numbers.stream()
        .filter(number -> number%2 == 0) // Lambda Expression
        // mapping -x -> x * x
        .map(number -> number * number)
        .forEach(System.out::print);  // Method Reference
		
	}

}

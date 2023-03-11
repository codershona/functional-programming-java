// Problem 1: Functional Approach: Print each elements from list on its own line
package programming;

import java.util.List;

public class Exercises {
	public static void main(String[] args) {
//		printAllNumbersInListStructured(List.of(12,9,13,4,6,2,4,12,15));
		
		List<Integer> numbers = (List.of(12,9,13,4,6,2,4,12,15));
//		printAllNumbersInListStructured(numbers);
//		printOddNumbersInListStructured(numbers);
		printCubesOffOddNumbersInListStructured(numbers);
		
		List<String> courses = (List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes"));
	
//		courses.stream()
//		  .forEach(System.out::println);
		
//		courses.stream()
////		  .filter(course -> course.contains("Spring"))
//		.filter(course -> course.length() >= 4)
//		  .forEach(System.out::println);
		
//		courses.stream()
//		  .map(course -> course.length())
//		  .forEach(System.out::println);
		
		
		courses.stream()
		  .map(course -> course + " " + course.length())
		  .forEach(System.out::println);
	
	}
	
	private static void printOddNumbersInListStructured(List<Integer> numbers) {
        numbers.stream()  // Convert to Stream
        .filter(number -> number%2 != 0) // Lambda Expression
        .forEach(System.out::print);  // Method Reference
		
	}
	
	private static void printCubesOffOddNumbersInListStructured(List<Integer> numbers) {
        numbers.stream()  // Convert to Stream
        .filter(number -> number%2 != 0) // Lambda Expression
        .map(number -> number * number * number)
        .forEach(System.out::print);  // Method Reference
		
	}

}

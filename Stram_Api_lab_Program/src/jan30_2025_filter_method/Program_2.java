package jan30_2025_filter_method;
//Write a Java program that uses the Stream.of method to create a stream of strings, filters out the empty strings, and then concatenate the remaining strings into a single string..

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program_2 {

	public static void main(String[] args) {

		
		//Stream.of("Hello", "", "World", " ", "from", " ", "Java", "!").filter(str-> str!="").forEach(System.out::print);	
		String collect = Stream.of("Hello", "", "World", " ","from", " ","Java", "!").filter(str->!str.trim().isEmpty()).collect(Collectors.joining());
		System.out.println(collect);
	}

}

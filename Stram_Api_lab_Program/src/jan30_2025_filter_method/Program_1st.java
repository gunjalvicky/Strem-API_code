package jan30_2025_filter_method;
//Write a Java program that creates a stream of integers using Stream.of, filters out the even numbers and then prints each squared number using 
import java.util.stream.Stream;

public class Program_1st 
{
	public static void main(String[] args) {
		Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).filter(num->num%2==0). forEach(System.out::println);
		System.out.println("-------------------------------------");
		Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).filter(num->num%2==0). forEach(num->System.out.println(num*num));
	}

}

package feb_4_2025;

import java.util.*;

public class Program_1 {

	public static void main(String[] args) 
	{
		List<Integer> number=Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		number.stream().filter(num->num%2!=0).forEach(num->System.out.println(num*num));
		
	}

}

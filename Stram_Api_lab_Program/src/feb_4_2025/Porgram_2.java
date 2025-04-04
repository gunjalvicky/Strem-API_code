package feb_4_2025;

import java.util.*;

public class Porgram_2 {

	public static void main(String[] args) 
	{
		List<String> list=Arrays.asList("apple", "banana", "orange", "grape", "pear");
		list.stream().sorted((s1,s2)->s2.compareTo(s1)).forEach(System.out::println);

	}

}

package jan30_2025_filter_method;

import java.util.*;
import java.util.stream.Stream;

public class Program_5 {

	public static void main(String[] args) 
	{
		List<String> list1=new ArrayList<String>();
		list1.add("Toby");
		list1.add("Anna");
		list1.add("Leroy");
		list1.add("sd");
		list1.stream().sorted().filter(str-> str.length()==4).limit(2).forEach(System.out::println);
		
		
	}

}

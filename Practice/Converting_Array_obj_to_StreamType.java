package Practice;

import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Converting_Array_obj_to_StreamType {

//	public static void main(String[] args) 
//	
//	{
//		int a[]= {12,32,43,22,44};
//		IntStream list=Arrays.stream(a);
//		list.forEach(System.out::println);
//		
//		long b[]= {23l,45l,66l,77l};
//		LongStream list1=Arrays.stream(b);
//		list1.forEach(System.out::println);
//		double c[]= {23.54,65.76,75.88};
//		DoubleStream list2=Arrays.stream(c);
//		list2.forEach(System.out::println);
//	}
//	public static void main(String[] args) {
//		List<Integer> list=Arrays.asList(34,34,65,43,23);
//		list.stream().distinct().forEach(System.out::println);
//	}
	 //Print the numbers in descending order
//	public static void main(String[] args) {
//		List<String> list2=Arrays.asList("Mahesh","Rahul","Kate");
//		list2.stream().map(str->str.toUpperCase()).sorted((s1,s2)->s2.compareTo(s1)).forEach(System.out::println);
//	}
//	public static void main(String[] args) {
//		List<Integer> list=Arrays.asList(23,45,65,1,2,4);
//		List<Integer>list2=list.stream().limit(2).collect(Collectors.toList());
//		System.out.println(list2);
//	}
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(23,45,65,1,2,4);
		List<Integer> list3=list.stream().skip(3).collect(Collectors.toList());
		System.out.println(list3);
	}
	
}

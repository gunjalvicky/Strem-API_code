package Jan_29_2025;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.stream.Stream;

public class Basic_Stream_API {

	// Integer to Stream
	
//	public static void main(String[] args) 
//	
//	{
//		ArrayList<Integer> list=new ArrayList<>();
//		list.add(12);
//		list.add(13);
//		Stream<Integer> str=list.stream();
//		list.forEach(p->System.out.println(list));
//	}
	
	//String to Stream
//	
//	public static void main(String srgs[])
//	{
//		ArrayList<String> str=new ArrayList<String>();
//		str.add("Gaurav");
//		str.add("Sai");
//		str.add("Vaibhav");
//		
//		Stream<String> str1 =str.parallelStream();
//		str1.forEach(name->System.out.println(name));
//	}
//	public static void main(String[] args) {
//		ArrayList<String> str=new ArrayList<String>();
//		str.add("Gaurav");
//		str.add("Sai");
//		str.add("Vaibhav");
//		str.add("Shubham");
//		str.add("Shantanu");
//		str.add("Shubham");
//		str.stream().filter(name->name.toUpperCase().charAt(0)=='S').sorted((s1,s2)->s2.compareTo(s1)).distinct().forEach(str2->System.out.println(str2));
//	}
	public static void main(String[] args) {
		ArrayList<Integer> num=new ArrayList<Integer>();
		num.add(12);
		num.add(14);
		num.add(13);
		num.add(11);
		num.stream().distinct().forEach(System.out::println);;
	}

}

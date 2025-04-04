package Jan_29_2025;

import java.net.Inet4Address;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {

	public static void main(String[] args) {
		List<String> list1=new ArrayList<>();
		list1.add("23");
		list1.add("Rohit");
		list1.add("66");
		list1.add("3");
		List<String> str=new ArrayList<>();
		str.add("Rohit");
		str.add("Kolhi");
		str.add("Kulkarni");
		
		List<List<String>> list =Arrays.asList(list1,str);
		System.out.println(list);
		 List<String> collect = list.stream().flatMap(k->k.stream()).collect(Collectors.toList());//Stream
		 
		 System.out.println(collect);
	}

}

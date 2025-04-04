package Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Combine_2_string {
	//flatMap()
	//map + Flattening [Converting Collections of collection into single collection]
//
//	public static void main(String[] args) {
//		
//	List<String> list=Arrays.asList("Swapnil","Nikhil","sanket");
//	List<String>list1=Arrays.asList("ram","lakshman","Sita");
//	List<List<String>> combine=Arrays.asList(list,list1);
//	List<String>collect=combine.stream().flatMap(list2->list2.stream()).collect(Collectors.toList());
//	System.out.println(collect);
//	}
	//Flattening of prime, even and odd number

//public static void main(String[] args) {
//	List<Integer>even=Arrays.asList(2,4,6,8);
//	List<Integer>odd=Arrays.asList(1,3,5,7,9);
//	List<List<Integer>> number=Arrays.asList(even,odd);
//	number.stream().flatMap(num->num.stream()).forEach(str->System.out.print(str+" "));
//}
	//Fetching first character using flatMap()
	public static void main(String[] args) {
		List<String> list=Arrays.asList("Mess","Hotel","Dhaba");
		List<Character>list1=list.stream().flatMap(str->Stream.of(str.charAt(0))).toList();
		System.out.println(list1);
		list.stream().map(str->str.charAt(0)).forEach(System.out::print);
	}

}

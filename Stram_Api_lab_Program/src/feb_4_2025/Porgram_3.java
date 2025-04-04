package feb_4_2025;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Porgram_3 {

	public static void main(String[] args) {
		 
		
		
List<List<Integer>> list=Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(2,3,4,5),Arrays.asList(4,5,6));
//System.out.println(list);
 List<Integer> collect=list.stream().flatMap(List::stream).distinct().collect(Collectors.toList());
// System.out.println(collect);
 collect.stream().forEach(System.out::println);
}
}
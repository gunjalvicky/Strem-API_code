package jan30_2025_filter_method;

import java.nio.file.DirectoryStream.Filter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program_4 {

	public static void main(String[] args) {
		//int [] arr= {-3, 2, -5, 6, -1, 4};
	List<Integer> list=new ArrayList<Integer>();
	list=Stream.of(-3, 2, -5, 6, -1, 4).filter(num->num>0).collect(Collectors.toList());
	int sum=0;
	for (Integer integer : list) {
		sum+=integer*integer;
	}
	System.out.println(sum);
	
	
	 
	
		}
	

}

package jan_31_jan_2025;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program_2 {

	public static void main(String[] args) 
	{
		String str1="Ram";
		String str2="lakhan";
		
		List<String> list=new ArrayList<String>();
		List<String> list2=new ArrayList<String>();
		
		list.add("Lakshaman");
		list.add("Ram");
		list.add("Sita");
		
		list2=list.stream().map(str->str.toUpperCase()).collect(Collectors.toList());
		System.out.println(list2);
		System.err.println("-------------------------");
		
		List<String> list3=new ArrayList<String>();
		list3.add(str1);
		list3.add(str2);
		List<String> collect=list3.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
		System.out.println(collect);
		

	}

}


package jan_31_jan_2025;

import java.util.*;
import java.util.List;

public class Program_4 {

	public static void main(String[] args) 
	{
		List<String>list=new ArrayList<String>();
		list.add("abcd");
		list.add("efgh");
		list.add("jklm");
		list.add("xyz");
		list.stream().map(str->Character.toUpperCase(str.charAt(0))+str.substring(1)).forEach(System.out::println);
		System.out.println("---------OR--------------");
		list.stream().map(str->str.substring(0, 1).toUpperCase()+str.substring(1)).forEach(System.out::println);

	}

}

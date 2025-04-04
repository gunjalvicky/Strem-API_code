package jan_31_jan_2025;

import java.util.*;

record Person(String name,Integer age)
{
	
}
public class Program_1 {

	public static void main(String[] args) {
		List<Person> list=new ArrayList<Person>();
		list.add(new Person("Dnynesh", 22));
		list.add(new Person("Nikhil", 21));
		list.add(new Person("sanket", 24));
		list.add(new Person("Vikram", 25));
//		list.stream().filter(ag->ag.name()).forEach(System.out::println);
		list.stream().sorted((p1,p2)-> p2.age().compareTo(p1.age())).limit(24).forEach(System.out::println);
	}
}

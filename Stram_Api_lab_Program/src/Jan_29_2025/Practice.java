package Jan_29_2025;

import java.util.stream.Collectors;
import java.util.*;
record Employee(String name,Integer salary)
{
	
}

public class Practice {

	public static void main(String[] args) 
	{
		List<Integer> list=new ArrayList<Integer>();
		list.add(23);
		list.add(34);
		list.add(32);
		list.add(54);
		list.stream().filter(num->num%2==0).forEach(str->System.out.println(str));
		System.out.println();
		list.stream().sorted().forEach(System.out::println);
		System.out.println();
		List<Integer> collect=list.stream().sorted((e1,e2)->e2.compareTo(e1)).collect(Collectors.toList());
		System.out.println(collect);
		List<Integer>Collect1=list.stream().sorted((n1,n2)->n2.compareTo(n1)).toList();
		System.out.println(Collect1);
		
		List<Employee> list1=new ArrayList<>();
		list1.add(new Employee("Rakesh",45000));
		list1.add(new Employee("Roshan",65000));
		list1.add(new Employee("Vaibhav",55000));
		
		list1.stream().filter(num->num.salary()>50000).forEach(str->System.out.println(str.name()));
		System.out.println();
		list1.stream().map(num->num.salary()-15000).forEach(System.out::println);
		list1.stream().sorted((s1,s2)->s2.name().compareTo(s1.name())).forEach(str->System.out.println(str));
		System.out.println();
		list1.stream().map(str->str.name().length()).forEach(System.out::println);
		System.out.println();
		List<Character>ch=list1.stream().map(str->str.name().charAt(0)).toList();
		System.out.println(ch);
		System.out.println();
		
	}

}

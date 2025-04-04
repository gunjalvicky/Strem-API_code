package feb_4_2025;


import java.util.*;

record Employee(String name,Double slary,Integer year)
{
	
}
public class Program_4 {

	public static void main(String[] args) 
	{
		List<Employee> list= new ArrayList<>();
		list.add(new Employee("john", 50000d, 6));
		list.add(new Employee("jane", 45000d, 4));
		list.add(new Employee("Tom", 6000d, 7));
		list.add(new Employee("lucky", 52000d, 5));
		list.add(new Employee("Anna", 48000d, 8));
		list.stream().map(num->num.year()>5 *(0.1)) .forEach(num->System.out.println(num));
		
		
		
		

	}

}

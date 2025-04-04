package jan_31_jan_2025;

import java.util.*;

record Employee(Integer id,Double salary)
{
	
}
public class Program_3 {

	public static void main(String[] args) 
	{
		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(12,23000d));
		list.add(new Employee (13,45000d));
		list.add(new Employee(15,23000d));
	
		list.stream().sorted((e1,e2)->(int)(e2.salary()-e1.salary())).forEach(num->System.out.println(num.salary()));
	
	}

}

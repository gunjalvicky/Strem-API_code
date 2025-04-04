package jan30_2025_filter_method;

import java.util.stream.Stream;

record Employee(String name,String id,Double salary)
{
	
}
public class Program_6 {

	public static void main(String[] args) 
	{
		Employee emp=new Employee("Vikram", "12",12000d);
		Employee emp1=new Employee("Rahul", "13",45555d);
		Stream.of(emp,emp1).filter(sal->sal.salary()>30000d).forEach(Payment->System.out.println(Payment.name()));
		

	}

}

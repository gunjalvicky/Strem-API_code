
package Jan_29_2025;

import java.util.stream.Stream;

record student(int id,String name,int marks)
{
	
}
public class Object_processing {

	public static void main(String[] args) {
		student st1=new student(1, "sai", 45);
		student st2=new student(1, "Gaurav", 78);
		student st3=new student(1, "Vaibhav", 43);
		
		Stream.of(st1,st2,st3).filter(mk->mk.marks()> 40).distinct().forEach(System.out::println);
		

	}

}

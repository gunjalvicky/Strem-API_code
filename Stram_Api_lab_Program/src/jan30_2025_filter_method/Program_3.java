package jan30_2025_filter_method;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

record student(String name, String course) {

}

public class Program_3 {

	public static void main(String[] args) {
		student st1 = new student("Alice", "Java");
		student st2 = new student("Bob", "Python");
		student st3 = new student("Charlie", "Java");
		student st4 = new student("David", "C++");
		student st5 = new student("Eve", "JavaScript");
		
		Stream.of(st1,st2,st3,st4,st5).filter(str->str.course()=="Java").forEach(stu->System.out.println(stu.name()));
		System.out.println("+--------------------------------------------------------+\n");
		Stream.of(st1,st2,st3,st4,st5).filter(str->str.course()=="Java" && str.name()=="Alice").forEach(stu->System.out.println(stu.name()));
		System.out.println("+---------------------------------------------------------+\n");
		List<student> student =new ArrayList<>();
		student.add(st1);
		student.add(st2);
		student.add(st3);
		student.add(st4);
		student.add(st5);
		
		student.stream().forEach(stud->System.out.println(stud.name()));
		
	}

}

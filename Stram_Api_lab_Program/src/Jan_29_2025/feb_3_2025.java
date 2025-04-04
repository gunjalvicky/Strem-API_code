package Jan_29_2025;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class feb_3_2025 {

	//Ex-
//	public static void main(String[] args) {
//		
//				ArrayList<String> al = new ArrayList<String>();
//				al.add("A");
//				al.add("BC");
//				al.add("CDE");
//				al.add("DEFG");
//				List<String> list = al.stream().filter(x -> x.length() >= 2).peek(x -> {}).toList();
//				System.out.println(list);
	//ex-3
//	public static void main(String[] args) {
//		List<Integer> list = new ArrayList<Integer>();
//		list.add(12);
//		list.add(13);
//		list.add(16);
//		list.add(14);
//		Optional<Integer> max = list.stream().max((x, y) -> x.compareTo(y));
//		System.out.println(max);
//	}

//		Ex-4
//	public static void main(String[] args) {
//		ArrayList<Integer> arrayList = new ArrayList<Integer>();
//		arrayList.add(20);
//		arrayList.add(21);
//		arrayList.add(22);
//		arrayList.add(23);
//		List<Integer> collect = arrayList.stream().sorted((x, y) -> y.compareTo(x)).collect(Collectors.toList());
//		System.out.println(collect);
//	}


//		ex-5
//		public static void main(String[] args) {
//			ArrayList<String> al = new ArrayList<String>();
//			al.add("A");
//			al.add("BC");
//			al.add("CDE");
//			al.add("DEFG");
//			List<String> list = al.stream().filter(x -> x.length() >= 2).peek(x -> {}).toList();
//			System.out.println(list);
//		}
	//	ex-6
//		public static void main(String[] args) {
//			ArrayList<Integer> al=new ArrayList<Integer>();
//			al.add(9);
//			al.add(10);
//			al.add(11);
//			al.add(12);
//			List<Integer> list = al.stream().dropWhile(x->x<=10).toList();
//			System.out.println(list);
//		}
	//	Ex-7
//	public static void main(String[] args) {
//		ArrayList<Integer> al=new ArrayList<Integer>();
//		al.add(9);
//		al.add(10);
//		al.add(11);
//		al.add(12);
//		List<Integer> list = al.stream().takeWhile(x->x<=10).toList();
//		System.out.println(list);
//	}
	//Ex-8
//	public static void main(String[] args) {
//		ArrayList<Integer> al=new ArrayList<Integer>();
//		al.add(-1);
//		al.add(-2);
//		al.add(-5);
//		al.add(0);
//		al.add(1);
//		al.add(2);
//		List<Integer> list = al.stream().skip(3).filter(y->y<=0).peek(x->{}).toList();
//		System.out.println(list);
//	}

	//Ex-9
//	public static void main(String[] args) {
//		TreeSet<Integer> treeSet=new TreeSet<Integer>((x,y)->y.compareTo(x));
//		treeSet.add(10); 
//		treeSet.add(14);
//		treeSet.add(13);
//		System.out.println(treeSet);
//		treeSet.stream().sorted(new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return o1 + o2;
//			}
//		}).forEach(System.out::println);
//	}

	//Ex-10
//	public static void main(String[] args) {
//		ArrayList<Integer> al = new ArrayList<Integer>();
//		al.add(1);
//		al.add(2);
//		al.add(3);
//		al.add(4);
//		al.add(5);
//		al.add(6);
//		List<Integer> list = al.stream().limit(4).toList();
//		System.out.println(list);
//	}
	//Ex-11
//	public static void main(String[] args) {
//		List<Integer> list = Arrays.asList(1,2,3,4,5);
//		list.stream().map(k -> k*2+3-k).forEach(k -> System.out.print(k +" "));
//	}
	//Ex-12   // [10,20,[30, 40]]   [10, 20, 30 , 40]
//	public static void main(String[] args) {
//		List<List<String>> list= Arrays.asList(Arrays.asList("1","2","3","4","5"));
//		
//		
//		 List<List<String>> collect = list.stream().flatMap(x -> list.stream()).collect(Collectors.toList());
//		
//		System.out.println(collect);
//		
//	}
	//13
//	public static void main(String[] args) {
//        List<String> words = Arrays.asList("apple", "banana", "cherry");
//        long count = words.stream()
//                          .map(String::toUpperCase)
//                          .filter(s -> s.startsWith("A"))
//                          .count();
//        System.out.println(count);
//    }
	//Ex-19
//	public static void main(String[] args) {
//		List<String> words = Arrays.asList();
//		String result = words.stream().map(String::toUpperCase).reduce((s1, s2) -> s1 + s2).orElseThrow(()->new IllegalArgumentException("There are no string value."));
//		System.out.println(result);
//	}
	//Ex-20
//	public static void main(String[] args) {
//		List<String> al = Arrays.asList("A", "B", "C", "D");
//		List<String> list = al.stream().skip(1).filter(x -> x.startsWith("B")).peek(x -> {}).toList();
//		System.out.println(list);
//
//	}
	//Ex-21
//	public static void main(String[] args) {
//		List<Integer> list = List.of(2, 3, 4, 5, 6);
//		list.stream().takeWhile(x -> x >= 0).map(x -> x * 0 + 2 + 3).peek(System.out::print).toList();
//	}
	//Ex-22
//	public static void main(String[] args) {
//		List<Integer> list = List.of(54,34,234,23,364,3);
//		list.stream().map(k -> k-k+2).filter(k -> k!=0).map(k -> 100)
//		.forEach(k -> System.out.print(k - 10 + " "));
//	}

	//Ex-26
//	public static void main(String[] args) {
//		Comparator<Integer> comparator = new Comparator<Integer>() {
//			public int compare(Integer o1, Integer o2) {
//				return o2.compareTo(o1);
//			}
//		};
//		List<Integer> list = List.of(54,34,234,23,364,3);
//		list.stream().sorted(comparator).filter(k -> k%2 == 1).forEach(k -> System.out.print(k + " "));
//	}
	//Ex27
//	static class Employee
//	{
//		private Integer id;
//		private String name;
//		public Integer getId() {
//			return id;
//		}
//		public String getName() {
//			return name;
//		}
//		public Employee(Integer id, String name) {
//			super();
//			this.id = id;
//			this.name = name;
//		}
//		@Override
//		public String toString() {
//			return "Employee [id=" + id + ", name=" + name + "]";
//		}
//	}
//	public static void main(String[] args) {
//		List<Employee> list = List.of(new Employee(1, "John") , 
//									new Employee(5, "Ram") ,
//									new Employee(7, "Tear") ,
//									new Employee(4, "Jerry") ,
//									new Employee(22, "You"));
//		list.stream().limit(3).sorted((o1,o2)->o2.getId() - o1.getId()).forEach(System.out::println);
//	}
	//Ex-28
//	public static void main(String args[]) {
//        List mylist = new ArrayList();
//        int[] val = {15, 5565, 646, 233, 100};
//        for (int element : val)
//            mylist.add(new Integer(element));
//        System.out.println(mylist);
//        Iterator iterator = mylist.iterator();
//        int i = mylist.size();  //i = 5
//        while (iterator.hasNext()) {
//            Integer element = (Integer) iterator.next();
//            int value = element.intValue();
//            i--;
//            if ((value < 100) || mylist.get(i).equals(100))
//                iterator.remove();
//        }
//        System.out.println(mylist);
//    }
//	Ex-30
	public static void main(String[] args) 
	{		
		class demo
		{  String name;Integer id;
			public demo(String name, Integer id) 
			{	this.name = name;this.id = id;
			}
			public String getName() {return name;}
			public Integer getId() {return id;}
			static void meth()
			{
				TreeMap<demo, Integer> tm 
                                = new TreeMap<>((a,b)->a.getName().compareTo(b.getName()));
				tm.put(new demo("Hello", 01), 1);
				tm.put(new demo("zello", 05), 2);
				tm.put(new demo("Bello", 011), 3);
				tm.put(new demo("Oello", 010), 4);
				WeakHashMap<demo, Integer> wm = new WeakHashMap<>(tm);
				wm.forEach(new BiConsumer<demo, Integer>()
				{
					public void accept(demo t, Integer u) 
					{
						System.out.println(t.getName()+ " " + t.getId() + " " + u);
					}
				});}}
		demo.meth();
	}








	

}

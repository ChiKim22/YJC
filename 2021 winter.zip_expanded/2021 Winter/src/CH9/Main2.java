package CH9;
import java.util.*;
public class Main2 {

	public static void main(String[] args) {
		/*
		 * 	Collection framework : 자료구조
		 * 								stack, queue, list, set, map, tree, ...
		 */
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(10);
		list.add(30);
		list.add(4);
		list.add(1);
		
//		for(int n : list)
//			System.out.println(n);
		
//		for(int i=0; i< list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
		System.out.println(list); // toString 메소드가 구현이 되어있어 그냥 구현이 가능함.
		
		Collections.sort(list);
		System.out.println("After Sorting...");
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println("After Sorting Descending...");
		System.out.println(list);
		
		ArrayList<String> strList = new ArrayList();
		strList.add("홍길동");
		strList.add("일지매");
		strList.add("성춘향");
		strList.add("박문수");
		strList.add("황단어");
		
		System.out.println(strList);
		Collections.sort(strList);
		System.out.println(strList);
		
		Student std = new Student();
		Person p = new Student();
		
		
	}
}

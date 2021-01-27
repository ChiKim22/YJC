package CH9;

import java.util.ArrayList;
import java.util.Collections;

public class Main3 {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		
		list.add(new Student(4, "홍길동", 3));
		list.add(new Student(3, "일지매", 2));
		list.add(new Student(2, "성춘향", 3));
		list.add(new Student(1, "박문수", 4));
		
		System.out.println(list);
		System.out.println("After Sorting...");
		Collections.sort(list);
		System.out.println(list);
	}
	
	public void sort(ArrayList<Student> list) {
		for(int i=0; i<list.size(); i++) {
			int minIdx=i;
			for(int j=i; j<list.size(); j++) {
				if (list.get(minIdx).compareTo(list.get(j)) > 0) {
				minIdx=j;
			}
		}
		
		Student s = list.get(i);
		list.set(i, list.get(minIdx));
		list.set(minIdx, s);
		
		}
		
	}

}

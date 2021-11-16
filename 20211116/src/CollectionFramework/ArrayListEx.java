package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("이숭무");  // 오브젝트 타입 저장
		list.add("이상범");			// 오브젝트 타입일 때는 꼭 형변환을 해서 사용해야 한다.
		list.add("이장범");		
		list.add("이장범"); // 리스트에서는 같은 값이 저장이 된다.
		list.set(3, "이길무"); // 리스트에 있는 값 수정
		for (int i = 0; i < list.size(); i++) {
			String s = (String) list.get(i);
			System.out.println(s);
		}
		// 아래처럼 사용하지 않는다.
		for (int i = 0; i < list.size(); i++) {

			System.out.println(i);
		}

		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list.get(i));

		}

		// 리스트에 있는 값을 삭제
		list1.remove(0);
		System.out.println(list1.size());
		
		System.out.println("=====================");
		
		System.out.println(list.size());
		
		for(Object obj : list) {
			String s = (String)obj;
			System.out.println(s);
		}
		list.remove(0);
		System.out.println(list.size());
		list.remove("이상범");
		System.out.println(list.size());
		list.clear(); // 지우기 // 배열 
		System.out.println(list.size());
		System.out.println(list.isEmpty()); // 사이즈가 비어있으면 true
		list.add("이숭무");
		System.out.println(list.isEmpty()); // 안 비어있으면 false
		// 리스트에서는 add size remove isEmpty ,removeAll , clear 정도는 알아 둬야한다.
	}

}

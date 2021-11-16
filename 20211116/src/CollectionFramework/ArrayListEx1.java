package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		for(int i = 0; i < list.size(); i++) {
			Board s = (Board)list.get(i);
			System.out.println(s.getContent());
		}
		list.add(1,new Board("제목1", "내용1", "글쓴이1"));
		for(int i = 0; i < list.size(); i++) {
			Board s = (Board)list.get(i);
			System.out.println(s.getContent());
		// 제너릭 타입
	List<Board> list1 = new ArrayList();
	list1.add(new Board("제목1", "내용1", "글쓴이1"));
	list1.add(new Board("제목2", "내용2", "글쓴이2"));
	list1.add(new Board("제목3", "내용3", "글쓴이3"));
	list1.add(new Board("제목4", "내용4", "글쓴이4"));
	for(int i1 = 0 ; i1 <list1.size(); i1++) {
		Board d= list1.get(i1);
		System.out.println(d.getContent());
		System.out.println(list1.get(i1).getContent());
	}
}
}
}
package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add(new Board("����1", "����1", "�۾���1"));
		
		list.add(new Board("����2", "����2", "�۾���2"));
		list.add(new Board("����3", "����3", "�۾���3"));
		list.add(new Board("����4", "����4", "�۾���4"));
		for(int i = 0; i < list.size(); i++) {
			Board s = (Board)list.get(i);
			System.out.println(s.getContent());
		}
		list.add(1,new Board("����1", "����1", "�۾���1"));
		for(int i = 0; i < list.size(); i++) {
			Board s = (Board)list.get(i);
			System.out.println(s.getContent());
		// ���ʸ� Ÿ��
	List<Board> list1 = new ArrayList();
	list1.add(new Board("����1", "����1", "�۾���1"));
	list1.add(new Board("����2", "����2", "�۾���2"));
	list1.add(new Board("����3", "����3", "�۾���3"));
	list1.add(new Board("����4", "����4", "�۾���4"));
	for(int i1 = 0 ; i1 <list1.size(); i1++) {
		Board d= list1.get(i1);
		System.out.println(d.getContent());
		System.out.println(list1.get(i1).getContent());
	}
}
}
}
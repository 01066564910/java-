package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("�̼���");  // ������Ʈ Ÿ�� ����
		list.add("�̻��");			// ������Ʈ Ÿ���� ���� �� ����ȯ�� �ؼ� ����ؾ� �Ѵ�.
		list.add("�����");		
		list.add("�����"); // ����Ʈ������ ���� ���� ������ �ȴ�.
		list.set(3, "�̱湫"); // ����Ʈ�� �ִ� �� ����
		for (int i = 0; i < list.size(); i++) {
			String s = (String) list.get(i);
			System.out.println(s);
		}
		// �Ʒ�ó�� ������� �ʴ´�.
		for (int i = 0; i < list.size(); i++) {

			System.out.println(i);
		}

		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list.get(i));

		}

		// ����Ʈ�� �ִ� ���� ����
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
		list.remove("�̻��");
		System.out.println(list.size());
		list.clear(); // ����� // �迭 
		System.out.println(list.size());
		System.out.println(list.isEmpty()); // ����� ��������� true
		list.add("�̼���");
		System.out.println(list.isEmpty()); // �� ��������� false
		// ����Ʈ������ add size remove isEmpty ,removeAll , clear ������ �˾� �־��Ѵ�.
	}

}

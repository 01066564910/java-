package access;

import access.access1.Ex04;
import access.access1.Ex05;

public class Ex06 {

	public static void main(String[] args) {
		Ex04 ex04 = new Ex04(); // �ٸ� ��Ű��
		// protected����� �ٸ� ��Ű���� ��Ӵ� ������ �ٸ� ��Ű���� �ִ� Ŭ�������� ����Ҽ��� ����.
		
		//ex04.first; 
		Ex03 ex03 = new Ex03(); //�ٸ� ��Ű������ ���
		//ex03.first; //  protected����� ��ӹ��� ��Ű���� ��� �� ���� ����
		Ex05 ex05 = new Ex05();
		// ex05.first;
	}

}

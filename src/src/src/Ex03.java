package src;

public class Ex03 {

	public static void main(String[] args) {
		int i = 10;
		System.out.println(i);
		// i = "10" ; ���ڿ�
		String str = "10";
		System.out.println(str); /// ���ڿ��� ��� "" ���� Ŀ�ټ� ������
		//char ch = '10' ;  ���ڿ� (1���� 0���ڰ� ������ ����)
		char ch = '0'; // ������ ��� : '' �̱� Ŀ�ټ�?   1~9�� ���� 10���ʹ� ���ڿ�
		System.out.println(ch);
		ch = '9' ;
		System.out.println(ch);
		ch = 0;
		System.out.println(ch); // ���鹮��
		ch = '0'; //48
		System.out.println(ch);
		System.out.println((int)ch);
		// String strl = 'a';
		// char ch1 = "a";
}
}

public class Ex02Test {

	public static void main(String[] args) {
		// final ������ �����ڸ� ���ؼ� �ʱ�ȭ�� ����
		Ex02 ex02 = new Ex02(10,20,"FSDFSD");  // ���̳� ������ ������
		// �ʱ�ȭ�� ���� ���������� ���Ѵ�. //�蹫���� �ʱ�ȭ ��������Ѵ� (00,00);����
		//ex02.first = 20;
	
		Ex02 ex021 = new Ex02(30,40,"sdfsdf");
		System.out.println(ex02.first);
		System.out.println(ex021.first);
		// final ����������ϴ� ������ �ν��Ͻ�����(��ü) final������ ���� ������ ���� �� �ִ�.
	}

}

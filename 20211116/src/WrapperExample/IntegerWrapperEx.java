package WrapperExample;

public class IntegerWrapperEx {

	public static void main(String[] args) {
		int i = 10;
		String s = "10";
		
		Integer i1 = 10;  // int �� ����
		i1 =  Integer.parseInt(s);  // ���ڿ��� ���ڷ� ����
		byte by = 10;
		byte by1 = 10;
		
		short sh = 10;  // �Ϲ��ڷ���
		short sh1 = 10; // �����ڷ���
		
		double d = 10.5;
		Double d1 = 10.5;
		
		float f = 10.5f;
		float f1 = 10.6f;
		
		//f = null;  // null : ���� �����ϵ� ��� ������ �𸣴� ��
		// f1 = null; // ���ڿ��� ���ڷ� ��ȭ�ϱ⵵ ������ null���� �����ϱ� ���ؼ� ��뵵�Ѵ�.
		
		}

}

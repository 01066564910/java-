
public class Ex02 {

	public static void main(String[] args) {
		int []i = new int[3];
		
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		
		Account ac1 = new Account();
		Account ac2 = new Account();
		Account ac3 = new Account();
	//   �ڷ���     ����    new ��ü
		Account[] accs = new Account[3];
		accs[0] = new Account("1111" , "�̼���" , 100); //������ ���� �ޱ� ���ؼ�? �Ű����� ������ �̿�
		accs[1] = new Account(); // 
		String[] str = new String[3];
		str[0] = "�̼���";
		str[1] = "�̻��";
		
		
	}

}

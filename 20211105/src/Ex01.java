
public class Ex01 {

	public static void main(String[] args) {
		// ���ͳ� : �ڿ��� : �Ϻ��� ,����, ... / �ڿ��� : ���� ,�Ǽ�
		/* �ڷ��� : ���� : byte ,char ,short , int,long
		 *     	  �Ǽ� : float(4) , double(8) 
		 *        ���� : char (2) : 'a','��' 
		         ���ڿ� : String : "abc" ,"����" , "a" ,"��"
		         
		 */ 
		// ����ȯ : �ڵ�����ȯ,��������ȯ
		short sh = 18;
		int i = sh; //�ڵ�����ȯ
		sh = (short)i; // ��������ȯ
		short sh1 = 10;
		short sh2 = 20;
		// short sh3 = sh1 +sh2;
		int i1 = sh1 + sh2;
		short sh4 = (short)(sh1+sh2);
		// short sh5 = (short)sh1 + (short)sh2;
		//	4byte => 2byte => 4byte
		//    			��������ȯ      �ڵ�����ȯ
		// byte => char => short => ini => long => float -> doble 
		// �� �������δ� ������ �ڵ�����ȯ�� �Ͼ��.
		// ��� : ���ǹ�,�ݺ���
		// if , if~else   , if ~ else if , if ~else if ~ ... ~else
		int money = 3000;
		 if (money >= 3000){
			 System.out.println("����Ÿ���ÿ�");
			 }
		 if (money >= 3000){
			 System.out.println("����Ÿ���ÿ�.");
		 }else {
			System.out.println("�ɾ�ÿ�");
		 }
	}

}

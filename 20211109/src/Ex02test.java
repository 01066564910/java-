
public class Ex02test {

	public static void main(String[] args) {
		int i =10;
	// cal = calulator();         cal.first = 10
	// cal1 = calulator();         cal.first = 20 ?
		Ex02    ex02  =  new Ex02();
	//  �ڷ���	������ 		
	//  		�������� �ҹ��ڷ� ����[ �ڷ���(class)�� �򰥸��� �ʱ� ���ؼ�]
		
		ex02.addr = "����";
		ex02.age = 27;
		ex02.name = "�̼���";
		ex02.gender = false;
		System.out.println(ex02.addr);
		System.out.println(ex02.gender);
		
		Ex02 ex021 = new Ex02();
		ex021.addr = "����";
		ex021.age = 33;
		ex021.name = "������";
		System.out.println(ex021.name);
				
		
	}

}


public class Ex03test {

	public static void main(String[] args) {
		Ex03 ex031 = new Ex03();
		ex031.first = 10;
		ex031.second = 20;
		ex031.val = 30;
		
		Ex03 ex032 = new Ex03();
		System.out.println(ex032.first); // 0
		System.out.println(ex032.second); // 0
		System.out.println(ex032.val);
		System.out.println(Ex03.val);
		int result = ex031.add();
		System.out.println(result); //40
		result = ex032.add();
		
		
		System.out.println(result);  //30
		
		result = Ex03.sub();
		// �޼��忡 staticŰ���忡�� Ŭ�������� �̿��ؼ� ����ϱ� ���� �޼����̴�.
		// �޼��峻���� this Ű���帣 ��� �� �� ����.
		//
		
	}

}
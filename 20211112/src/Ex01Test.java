
public class Ex01Test {

	public static void main(String[] args) {
		int i = 10;
		System.out.println(i);
		double d = 10.5;
		System.out.println(d);
		int ii[] = new int[3]; // ii : | | | |
								// 0 1 2
		ii[0] = 10; // int i1 = 10;
		ii[1] = 20;
		System.out.println(ii[0]);
		System.out.println(ii[1]);
		Ex01 ex01 = new Ex01(); // ex01 | radius | pi |
		ex01.radius = 10; // areaCircle
		ex01.pi = 3.141592;
		double result = ex01.areaCircle();
		System.out.println(result);
		System.out.println(ex01.pi);
		System.out.println(ex01.getRadius());
		System.out.println(ex01.getPi());
		Ex01 ex011 = new Ex01(); // ex011 | radius | pi | ��ü |
		ex011.radius = 20;
		double d0001[] = new double[3]; // double | | | |
		int i001[] = new int[3]; // int | | | |
		Ex01 ex001[] = new Ex01[3]; // ex01 | new Ex01()| |  |
		// 0 1 2								0		 1  2
		i001[0] = 10; // 					 pi | radius |
		d0001[0] = 10.5;
		ex001[0] = new Ex01();
		ex01 = new Ex01();
		ex01.pi = 3.141592;
		ex001[0].pi = 3.14592; 
		// ����ʵ�� ��ä���� �ִ°� ����ʵ�
	}

}

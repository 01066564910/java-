
public class ���� {

	public static void main(String[] args) {

		System.out.println("1�� ==================");
		int i = 1;
		while (i < 10) {
			i++;
		}
		System.out.println(i);

		System.out.println("2�� ==================");
		for (i = 1; i < 11; i += 1) {
			System.out.println("������" + i + "�� ������ϴ�.");
		}
		System.out.println("3�� ==================");
		int y1 = 0;
		i = 1;

		for (i = 1; i < 6; i++) {
			System.out.println(i);
			if (i == 5) {
				y1 += 1;
				System.out.println(y1);
			}
		}
		System.out.println("4�� ==================");
		for (i = 1; i < 11; i++) {
			System.out.println("�̾��ڴ��� �������� �����ž��մϴ�.");
		}
		System.out.println("5�� ==================");
		for (i = 10; i <= 20; i += 1) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("6�� ==================");
		i = 9;
		while (i < 20) {
		
			i += 1;
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		System.out.println("7�� ==================");

		for (i = 10; i <= 25; i++) {
			if (i % 4 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("8�� ==================");
		i = 12;
		while (i<=20) {
			i++;
			if (i %2 ==0)
			System.out.println("������ ���Ϸ��� �ڹٸ� ���̼ž��մϴ�.");
		}
		
		System.out.println("9�� ==================");
		for(int gop=1; gop<=9; gop++) {
			System.out.println("9*"+gop+"="+9*gop);
		}
		System.out.println("17�� ==================");
		
		i = 1;
		while ( i<=10) {
			int gop = (int)(Math.random()*45) +1;
			i +=1;
			if (gop% 2 == 0)
				System.out.println("3*" + gop +"=" + 3*gop);
			else i--;
		
		}
}
}
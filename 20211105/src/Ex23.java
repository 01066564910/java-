import java.util.Scanner; //��Ʈ�� + ����Ʈ +o => import

public class Ex23 {

	public static void main(String[] args) {
		// syso ��Ʈ�� + �����̽� => System.out.println(); �� �ٷεȴ� .
		// ������ ��Ʈ���� ��
		// num = int(input("ù�� ° ���ڸ� �Է����ּ���."))
		// java �� Scanner ���ִ�.
		/*
		 * Scanner sc = new Scanner(System.in); System.out.print("�̸��� �Է��ϼ���.:"); String
		 * name = sc.next(); //���ڸ� �޾� �� ���� next System.out.println("�̸��� :"+ name);
		 * System.out.print("���ڸ� �Է����ּ���.: "); int num = sc.nextInt();
		 * System.out.println("���� :" + num);
		 */

		// ���� : �ܰ� ���� ������ �Է� �޾� �������� ����Ͻÿ�.

		Scanner sc = new Scanner(System.in);
		while (true) { // ������ �����ϱ� ���ؼ� true���
			System.out.println("������ ���� �Է��ϼ���");
			int StartDan = sc.nextInt();
			System.out.println("������ ���� �Է��ϼ���");
			int endDan = sc.nextInt();
			System.out.println("������ ���� �Է��ϼ���");
			int startGop = sc.nextInt();
			System.out.println("������ ���� �Է��� �ּ���");
			int endGop = sc.nextInt();
			int dan = StartDan;
			while (dan < endDan) {
				int gop = startGop;
				while (gop <= endGop) {
					System.out.println(dan + "*" + gop + "=" + dan * gop);
					gop++;

				}
				dan++;
			}
			System.out.println("�����Ϸ��� 'y'�ƴϸ� �ƹ�Ű��.");
			String stop = sc.next();
			if (stop.equals("y")) {
				System.out.println("���α׷� ����");
				break;
			}
		}
	}
}

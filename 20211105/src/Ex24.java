import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String stop;
		do { // ������ �����ϱ� ���ؼ� true���
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
			stop = sc.next();
		}while(!stop.equals("y"));
	}

}
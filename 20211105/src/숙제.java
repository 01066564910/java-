
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
		while (i <= 20) {
			i++;
			if (i % 2 == 0)
				System.out.println("������ ���Ϸ��� �ڹٸ� ���̼ž��մϴ�.");
		}

		System.out.println("9�� ==================");
		for (int gop = 1; gop <= 9; gop++) {
			System.out.println("9*" + gop + "=" + 9 * gop);
		}
		System.out.println("10�� ==================");
		int a = 0;
		while (a <= 9) {
			a++;
			if (a % 2 != 0) {
				System.out.println("6*" + a + "=" + 6 * a);

			}
		}
		System.out.println("11�� ==================");
		
		
		
		
		
		System.out.println("12�� ==================");

		for (a = 1; a <= 9; a++) {
			int b = 6;
			if (a % 2 != 0)
				System.out.println(b + "*" + a + "=" + b * a);
		}

		System.out.println("13�� ==================");
		int sum=0;
		for(a=1; a<=10; a++) {
			
			sum+=a;
			
		}System.out.println(sum);
		
		System.out.println("14�� ==================");
		while (a<1001) {
			a+=1;
			sum+=a;
					
		}System.out.println(sum);
		
		
		System.out.println("15�� ==================");
		for(a=3; a<=8; a++){
			System.out.println("6*"+a+"="+6*a);
		}
		
		System.out.println("16�� ==================");
		int i1= (int)(Math.random()*45) +1;
		
		for(int ai=1; ai<=i1; ai++) {
			System.out.println("������ ���Ϸ��� �ڹٸ� ���̼ž��մϴ�");	
		}
	
	}
}
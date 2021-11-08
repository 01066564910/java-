
public class 숙제 {

	public static void main(String[] args) {

		System.out.println("1번 ==================");
		int i = 1;
		while (i < 10) {
			i++;
		}
		System.out.println(i);

		System.out.println("2번 ==================");
		for (i = 1; i < 11; i += 1) {
			System.out.println("나무를" + i + "번 찍었습니다.");
		}
		System.out.println("3번 ==================");
		int y1 = 0;
		i = 1;

		for (i = 1; i < 6; i++) {
			System.out.println(i);
			if (i == 5) {
				y1 += 1;
				System.out.println(y1);
			}
		}
		System.out.println("4번 ==================");
		for (i = 1; i < 11; i++) {
			System.out.println("이쓰앰님을 전적으로 믿으셔야합니다.");
		}
		System.out.println("5번 ==================");
		for (i = 10; i <= 20; i += 1) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("6번 ==================");
		i = 9;
		while (i < 20) {
		
			i += 1;
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		System.out.println("7번 ==================");

		for (i = 10; i <= 25; i++) {
			if (i % 4 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("8번 ==================");
		i = 12;
		while (i <= 20) {
			i++;
			if (i % 2 == 0)
				System.out.println("개발을 잘하려면 자바를 들이셔야합니다.");
		}

		System.out.println("9번 ==================");
		for (int gop = 1; gop <= 9; gop++) {
			System.out.println("9*" + gop + "=" + 9 * gop);
		}
		System.out.println("10번 ==================");
		int a = 0;
		while (a <= 9) {
			a++;
			if (a % 2 != 0) {
				System.out.println("6*" + a + "=" + 6 * a);

			}
		}
		System.out.println("11번 ==================");
		
		
		
		
		
		System.out.println("12번 ==================");

		for (a = 1; a <= 9; a++) {
			int b = 6;
			if (a % 2 != 0)
				System.out.println(b + "*" + a + "=" + b * a);
		}

		System.out.println("13번 ==================");
		int sum=0;
		for(a=1; a<=10; a++) {
			
			sum+=a;
			
		}System.out.println(sum);
		
		System.out.println("14번 ==================");
		while (a<1001) {
			a+=1;
			sum+=a;
					
		}System.out.println(sum);
		
		
		System.out.println("15번 ==================");
		for(a=3; a<=8; a++){
			System.out.println("6*"+a+"="+6*a);
		}
		
		System.out.println("16번 ==================");
		int i1= (int)(Math.random()*45) +1;
		
		for(int ai=1; ai<=i1; ai++) {
			System.out.println("개발을 잘하려면 자바를 들이셔야합니다");	
		}
	
	}
}

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
		while (i<=20) {
			i++;
			if (i %2 ==0)
			System.out.println("개발을 잘하려면 자바를 들이셔야합니다.");
		}
		
		System.out.println("9번 ==================");
		for(int gop=1; gop<=9; gop++) {
			System.out.println("9*"+gop+"="+9*gop);
		}
		System.out.println("17번 ==================");
		
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
import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String stop;
		do { // 무조건 실행하기 위해서 true사용
			System.out.println("시작할 단을 입력하세요");
			int StartDan = sc.nextInt();
			System.out.println("마지막 단을 입력하세요");
			int endDan = sc.nextInt();
			System.out.println("시작할 곱을 입력하세요");
			int startGop = sc.nextInt();
			System.out.println("마지막 곱을 입력해 주세요");
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
			System.out.println("종료하려면 'y'아니면 아무키나.");
			stop = sc.next();
		}while(!stop.equals("y"));
	}

}
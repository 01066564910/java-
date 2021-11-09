
public class Ex13Test {
	public static void main(String[] args) {
		/*
		// 6단 출력
		for (int i = 1; i <= 9; i++) {
			System.out.println("6*" + i + "=" + 6 * i);
		}
		// 8단 출력
		for (int i = 1; i <= 9; i++) {
			System.out.println("8*" + i + "=" + 8 * i);
		}

		// 3단 출력
		for (int i = 1; i <= 9; i++) {
			System.out.println("3*" + i + "=" + 3 * i);

		}
	}}
	*/
	gogo(3);   // argument :인자
	gogo(6); //클래스 내에서 메소드를 호출 할 때에는 메소드 명만 적으면 된다.
	gogo(7); // 외부에서는 객체 명.(메소드)가 된다.
	int result = 10 + 3;
	System.out.println(result);
	result = 30+6;
	System.out.println(result);
	result = add(20,10);
	System.out.println(result);
	int result1 =add(30,10);
	System.out.println(result1);
		}// 반복적으로 사용하는 코드가 있는 경우 함수로
	  // 						dan : parameter :매개변수
	public static void gogo(int dan) {
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + "*"+i + "=" + dan * i);
	
		}
	}
	public static int add(int num1, int num2){
		return num1 + num2;
	}
}

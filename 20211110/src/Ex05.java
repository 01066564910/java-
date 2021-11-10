
public class Ex05 {
	static int first; // 정적 변수
	static int second;
	int val; // 멤버변수 , instance변수(객체 마다 존재하는 변수)
	static { // 정적변수만 초기화 할 수 있다.
		first = 20;
		second = 10;
		// val = 10; instance변수는 static 블럭에서 초기화 할 수가 없다.
	}

	public static int add() {
		return first + second;
	}
}

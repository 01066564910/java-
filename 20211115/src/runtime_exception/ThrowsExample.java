package runtime_exception;

public class ThrowsExample {
	public static void main(String[] args) {
		try {
			test(); // 호출함수
		} catch (ArithmeticException e) {
			System.out.println(0);
		}
	}
						//   ↓ 호출 함수쪽으로 에외를 돌려줄 때에는 throws 연산자를 사용해야 한다.
	public static void test() throws ArithmeticException {
		int i = 2;			// throws 다음에는 무슨 오류를 제외 할 것인지 써야한다
		int j = 0;			// ex :  throws ArithmeticException 

		System.out.println(i / j);

	}
}

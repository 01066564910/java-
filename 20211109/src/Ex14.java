
public class Ex14 {
	int result;
	int first;
	int second;
	int add; // 변수  //뒤에 괄호가 없으면 변수 괄호가 있으면 함수
	public Ex14(int first , int second) {
		this.first = first; //(this로 매개변수와 넘버필드를 구분해준다.
		this.second=second;
		// public Ex14(int num , int second) {
	//	first = num;                        ???
	//	this.second=second;
	}
	// 메서드의 4가지 유형
	// 1.입력값이 있고 결과값이이 있는 메서드
	//               ↓입력값
	public int add(int num1, int num2) {
		return num1 + num2 ;
	}//     ↑반환값
	//메서드 오버 로딩
	public int div(int num1,int num2) {
		return num1 / num2 ;
	}
	
	//2. 입력값이 있고 결과값이(반환형이) 없는 메서드
	             //      ↓입력값

	public void sub(double num1,int num2) {//  <- 메서드 오버로딩 매개변수의 순서가 다르다
		result = (int)num1 - num2; // result 는 매개변수가 없어서 헷갈릴 일이 없어서
										//this 를 안 붙여도 된다.
		System.out.println(this.result);
		
		
	} //   반환형이 다른거는 의미가 없다
	//    메서드의 갯수나 메서드의 타입이 달라야 한다.
	// 메서드의 오버로딩
	public int sub(int num1 , double num2) {
		return num1 - (int)num2;
	}
	//3. 입력값은 없고 결과같이 있는 메서드
	public int mul() {
		return this.first * this.second;
	}//   ↑반환값  return 이 있어야 반환값이다.
	//4. 입력값이 없고 결과값이 없는 함수
	public void div() {
		System.out.println(this.first / this.second);
	}
}

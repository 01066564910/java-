package runtime_exception;

public class TryCacthFinallyExample {

	public static void main(String[] args) {
		Point1 point = null; 	//  Point point = new Point();
		try{
			point.print();
		
		
		}catch(NullPointerException e) {
			point = new Point1();
			point.print();
			
		}finally {//try랑 catch에서 공통적으로 실행해야 할 코드 가 있다면 finally를 적고
			// 코드를 실행 시키면 둘 다 실행이 된다.
			System.out.println("프로그램이 정상적으로 실행 중입니다.");
		}
		
		
	}

}
class Point1{
	public void print() {
		System.out.println("출력");
	}
}
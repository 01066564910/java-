package runtime_exception;

public class TryCacthFinallyExample {

	public static void main(String[] args) {
		Point1 point = null; 	//  Point point = new Point();
		try{
			point.print();
		
		
		}catch(NullPointerException e) {
			point = new Point1();
			point.print();
			
		}finally {//try�� catch���� ���������� �����ؾ� �� �ڵ� �� �ִٸ� finally�� ����
			// �ڵ带 ���� ��Ű�� �� �� ������ �ȴ�.
			System.out.println("���α׷��� ���������� ���� ���Դϴ�.");
		}
		
		
	}

}
class Point1{
	public void print() {
		System.out.println("���");
	}
}
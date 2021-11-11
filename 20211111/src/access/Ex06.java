package access;

import access.access1.Ex04;
import access.access1.Ex05;

public class Ex06 {

	public static void main(String[] args) {
		Ex04 ex04 = new Ex04(); // 다른 패키지
		// protected멤버는 다른 패키지에 상속는 되지만 다른 패키지에 있는 클레스에서 사용할수는 없다.
		
		//ex04.first; 
		Ex03 ex03 = new Ex03(); //다른 패키지에서 상속
		//ex03.first; //  protected멤버는 상속받은 패키지도 사용 할 수가 없다
		Ex05 ex05 = new Ex05();
		// ex05.first;
	}

}

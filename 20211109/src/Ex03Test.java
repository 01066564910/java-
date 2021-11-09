
public class Ex03Test {

	public static void main(String[] args) {
		// ex03 = Ex03() # 파이썬에서 선언 하는 방식
		Ex03 ex03 = new Ex03(); // 자바에서 선언하는 방식
		// 파이썬은 ex03 = Ex03();
		ex03.setData(20, 10);
		// ex03.first = 20; ex03.second = 10
		ex03.add();
		System.out.println(ex03.result);
		ex03.sub();
		System.out.println(ex03.result);
		
		Ex03 ex003 = new Ex03();
		ex003.setData(200,100);
		ex003.sub();
		System.out.println(ex003.result);
	}

}
//데이터에 있다가 힙 영역으로 갖고온다 힙 영역은 객체
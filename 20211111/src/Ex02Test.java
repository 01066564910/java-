
public class Ex02Test {

	public static void main(String[] args) {
		// final 변수는 생성자를 통해서 초기화가 가능
		Ex02 ex02 = new Ex02(10,20,"FSDFSD");  // 파이널 변수가 있으면
		// 초기화된 값을 변경하지는 못한다. //↑무조건 초기화 시켜줘야한다 (00,00);으로
		//ex02.first = 20;
	
		Ex02 ex021 = new Ex02(30,40,"sdfsdf");
		System.out.println(ex02.first);
		System.out.println(ex021.first);
		// final 변수를사용하는 이유는 인스턴스마다(객체) final변수의 값을 별개로 가질 수 있다.
	}

}

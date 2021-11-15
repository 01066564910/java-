
public interface Ex03 {
// 상수 , 추상메서드 를 갖고있는애를 ==> 인터페이스
	static final int FISRT = 10;

	public void menthod01(); // 추상메서드 //오버 라이딩
	// 생성자가 없다.
	// 일반메서드가 없다. //멤버필드도 없다.
	// ㅁ메서드가 하는 역할 : 외부로부터 멤버필드에 값을 전달 받거나
	// : 멤버필드에 있는 값을 외부에 전달하기 위해서 사용 , setter , getter

	default void method02() {
		System.out.println("default - method");

	}

	static void method03() {
		System.out.println("static - method");
	}
}

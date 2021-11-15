
public abstract class Ex01 {

	int first; // 멤버필드

	public Ex01(int first) {
		this.first = first;
	}

	// 추상메서드
	public abstract void method01(); // 정의되지 않은 메서
	// 일반메서드

	public void method02() {
		System.out.println("Ex01.method");
	}

}

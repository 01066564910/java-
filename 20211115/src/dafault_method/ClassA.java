package dafault_method;
//추상 클래스는 일반 메서드를 만들 수 있다. 오버라이드 할 떄랑 안할 때가 있는 경우에는
//  추상 클래스를 만든다.
public abstract class ClassA { // 추상 클래스란
	public abstract void method01(); // 추상 메서드
	// 일반 메서드가 있는것
	public void method02() {
		System.out.println("ClassA - method02");
	}
}

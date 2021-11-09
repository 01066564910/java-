
public class Ex061 {
	String name;
	int age;
	double height;
 /// 자바에서는 생성자를 클래스명과 같아야 한다. // 일반 함수와달리 void 가 없어야 한다.
//  생성자
// 접근지정자 클래스명(매개변수,...)
	public Ex061(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}

	// setter
	//     void => 반환형(void: 반환할게 없다.)
	public void setAge(int age) {
		this.age = age;
	}

	public    void   setName(String name) {
		this.name = name;
	}

	public void setHeight(double height) { 
		this.height = height;
	}
	// 클래스 안에있는 함수들을 메서드라고 부른다
	/// 접근지정자(ex: public 반환형  함수명     (매개변수)
	// getter (반환할게 있다)
	public int getAge() {
		// 정수를 반환할게 있다. int를 반환 한다 (반환 : 호출한 쪽으로 값을 넘기는 것)
		return this.age;
	}

	public String getName() {
		return this.name;
	}

	public double getHeight() {
		return this.height;
	}
}

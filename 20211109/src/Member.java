
public class Member {
	int age;
	double height;
	String name;

	public Member() {}  // 디펄트 생성자

	public Member(int age) { // 메서드 오버로딩 (매개변수의 갯수가 다르거나 매개변수의 타입이 다를때
		//                                   이다.
		this.age = age;
	}

	public Member(String Name) {
		this.name = name;
	}

	public Member(int age, double height, String name) {
		this.age = age;
		this.height = height;
		this.name = name;
	}
	public Member(double height,int age, String name) {
		
		this.height = height;
		this.age = age;
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public double getHeight() {
		return this.height;
	}

	public String getName() {
		return this.name;
	}

}
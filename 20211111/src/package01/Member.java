package package01; // 어느 패키지 명에 있다고 패키지 명이 들어가야 한다.

public class Member {
	int age;
	double height;
	String name;
	boolean gender;
	public Member() {}
	public Member(int age , double height, String name  ) {
		this.age = age;
		this.height = height;
		this.name = name;
	}
	//setter
	public void setAge(int age) {
		this.age = age;
		
	}public void setHeight(double height) {
		this.height = height;
	}public void setName(String name) {
		this.name = name;
		
	} public void setGender(boolean gender) {
		this.gender=gender;
	}
	// getter
	public int getAge() {
		return this.age;
	}public double getHeight() {
		return this.height;
	}public String getName() {
		return this.name;
	}
	// boolean 타입은 get도 되는데 일반적으로 is를 쓴다.
	public boolean isGender() {
		return gender;
	}
}

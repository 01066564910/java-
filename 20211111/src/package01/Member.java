package package01; // ��� ��Ű�� ���� �ִٰ� ��Ű�� ���� ���� �Ѵ�.

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
	// boolean Ÿ���� get�� �Ǵµ� �Ϲ������� is�� ����.
	public boolean isGender() {
		return gender;
	}
}
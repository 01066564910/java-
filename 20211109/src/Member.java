
public class Member {
	int age;
	double height;
	String name;

	public Member() {}  // ����Ʈ ������

	public Member(int age) { // �޼��� �����ε� (�Ű������� ������ �ٸ��ų� �Ű������� Ÿ���� �ٸ���
		//                                   �̴�.
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

public class Ex061 {
	String name;
	int age;
	double height;
 /// �ڹٿ����� �����ڸ� Ŭ������� ���ƾ� �Ѵ�. // �Ϲ� �Լ��ʹ޸� void �� ����� �Ѵ�.
//  ������
// ���������� Ŭ������(�Ű�����,...)
	public Ex061(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}

	// setter
	//     void => ��ȯ��(void: ��ȯ�Ұ� ����.)
	public void setAge(int age) {
		this.age = age;
	}

	public    void   setName(String name) {
		this.name = name;
	}

	public void setHeight(double height) { 
		this.height = height;
	}
	// Ŭ���� �ȿ��ִ� �Լ����� �޼����� �θ���
	/// ����������(ex: public ��ȯ��  �Լ���     (�Ű�����)
	// getter (��ȯ�Ұ� �ִ�)
	public int getAge() {
		// ������ ��ȯ�Ұ� �ִ�. int�� ��ȯ �Ѵ� (��ȯ : ȣ���� ������ ���� �ѱ�� ��)
		return this.age;
	}

	public String getName() {
		return this.name;
	}

	public double getHeight() {
		return this.height;
	}
}

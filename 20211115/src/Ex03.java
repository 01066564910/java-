
public interface Ex03 {
// ��� , �߻�޼��� �� �����ִ¾ָ� ==> �������̽�
	static final int FISRT = 10;

	public void menthod01(); // �߻�޼��� //���� ���̵�
	// �����ڰ� ����.
	// �Ϲݸ޼��尡 ����. //����ʵ嵵 ����.
	// ���޼��尡 �ϴ� ���� : �ܺηκ��� ����ʵ忡 ���� ���� �ްų�
	// : ����ʵ忡 �ִ� ���� �ܺο� �����ϱ� ���ؼ� ��� , setter , getter

	default void method02() {
		System.out.println("default - method");

	}

	static void method03() {
		System.out.println("static - method");
	}
}

package abstract_class;

public class SmartPhone extends Phone {	// �ڽ� Ŭ������ abstract�� ��� �� �Ѵ�.
						// �߻� Ŭ������ ����� ������ �߻� �޼��带 ������ �Ͽ� ����Ѵ�.
// �߻�Ŭ������ ����ؼ� ����ϰ� �߻�޼��带 �������ؼ� ����ؾ� �Ѵ�.
	public SmartPhone(String owner) {
		super(owner);
	}

	@Override
	public void turnOn() {
		System.out.println("�� ������ ŵ�ϴ�");

	}

	@Override
	public void turnOff() {
		System.out.println("�� ������ ���ϴ�.");

	}

}

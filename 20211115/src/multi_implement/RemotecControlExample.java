package multi_implement;

public class RemotecControlExample {

	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		Searchable sc = tv;
		RemotecControl rc = tv;
		// �θ� �ִ� �͸� ��� �����ϴ�.
		sc.search("�̼���");
		rc.turnOn();
		rc.turnOff();
		// ��� ���� ��� ���� ����� �� �ִ�.
		tv.search("�̻��");
		tv.turnOn();
		tv.turnOff();
	}

}

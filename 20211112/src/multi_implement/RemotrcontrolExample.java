package multi_implement;

public class RemotrcontrolExample {

	public static void main(String[] args) {
		SmartTelevision st = new SmartTelevision();

		RemoteControl rc = st;

		Searchable sc = st;
		rc.turnOn();
		rc.turnOff();
		sc.search("�̼���");
	}

}

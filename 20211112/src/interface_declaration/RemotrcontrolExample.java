package interface_declaration;

public class RemotrcontrolExample {

	public static void main(String[] args) {
		/*
		 * Audio audio = new Audio();
		 * Television television = new Television(); // �ʹ� �� ȿ�����̴� �̷��� �Ⱦ�
		 */
		Remotrcontrol r;
		r = new Audio();
		r.turnOn();
		r.turnOff();
		
		r = new Television();
		r.turnOn();
		r.turnOff();
	}

}

package interface_declaration;

public class RemotrcontrolExample {

	public static void main(String[] args) {
		/*
		 * Audio audio = new Audio();
		 * Television television = new Television(); // 너무 비 효율적이다 이렇게 안씀
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

package fiedl_polymorphism;

public class Car {
	// �θ� ������ �ڽ� ��ä�� ���� �� �� �ִ�. �ڵ��� ��ȯ
	Tire frontLeftTire = new KumhoTire();
	Tire frontRightTire = new KumhoTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}

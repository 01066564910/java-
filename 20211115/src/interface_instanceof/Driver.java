package interface_instanceof;

public class Driver {
public void drive(Vehicle vehicle) {
	// instanceof�� Ŭ������ ��ü�� ������ ���� �� ����Ѵ�.
	if(vehicle instanceof Bus) {  // instanceof�� ��ü�� ���� �� ����Ѵ�.
		//vehicle ��ü�� 	BusŬ������ ������� ��ü�Դϴ�.
		// instanceof�� �ᰡ���� boolean �̴�.
 		Bus bus = (Bus) vehicle;
		bus.checkFare();
	}
	
	vehicle.run();
}
}

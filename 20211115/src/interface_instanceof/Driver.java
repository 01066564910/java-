package interface_instanceof;

public class Driver {
public void drive(Vehicle vehicle) {
	// instanceof는 클래스와 객체가 같은지 비교할 때 사용한다.
	if(vehicle instanceof Bus) {  // instanceof는 객체를 비교할 때 사용한다.
		//vehicle 객체가 	Bus클래스로 만들어진 객체입니다.
		// instanceof의 결가값은 boolean 이다.
 		Bus bus = (Bus) vehicle;
		bus.checkFare();
	}
	
	vehicle.run();
}
}

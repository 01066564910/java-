package method_polymorphism;

public class DriveExample {

	public static void main(String[] args) {
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		bus.run();
		taxi.run();
		Vehicle v = bus;
		v.run();   // 부모 객채를 이용해서 자식을 실행시킬 수 있다.
		v = taxi;
		v.run();
		Driver driver = new Driver();
		driver.drive(taxi);
		driver.drive(bus);
		drive(bus);
		drive(taxi);
	}
	public static void drive(Vehicle v) {
		v.run();
	}
}

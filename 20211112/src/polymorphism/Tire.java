package polymorphism;

public class Tire {
	public int maxRotation; // 최대 회전수?
	public int accumulatedRotation; // 누적 회전수
	public String location;

	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	public boolean roll() { // 타이어가 굴러가는 메서드 // 오버라이딩을 할거다
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println("***" + location + " Tire 수명 :" +
					(maxRotation - accumulatedRotation)+"회");
return true;
		} else {
			System.out.println("***" + location + "  Tire 펑크 ***");
			return false;
		}

	}
}

package polymorphism;
//                B               A  ;  A=B
public class HankookTire extends Tire { // tire = HankokTire
	public HankookTire (String location , int maxRotation) {
		super(location,maxRotation);
	}@Override
	public boolean roll() { // 타이어가 굴러가는 메서드 // 오버라이딩을 할거다
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println("***" + location + " HankookTire 수명 :" +
					(maxRotation - accumulatedRotation)+"회");
return true;
		} else {
			System.out.println("***" + location + "  KumhoTire 펑크 ***");
			return false;
		}
}
}
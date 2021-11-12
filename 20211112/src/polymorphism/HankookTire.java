package polymorphism;
//                B               A  ;  A=B
public class HankookTire extends Tire { // tire = HankokTire
	public HankookTire (String location , int maxRotation) {
		super(location,maxRotation);
	}@Override
	public boolean roll() { // Ÿ�̾ �������� �޼��� // �������̵��� �ҰŴ�
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println("***" + location + " HankookTire ���� :" +
					(maxRotation - accumulatedRotation)+"ȸ");
return true;
		} else {
			System.out.println("***" + location + "  KumhoTire ��ũ ***");
			return false;
		}
}
}
package inheritance;

public class Ex09  extends Ex08{
	// public Ex09 () {} �θ� Ŭ������ ���� ������ ��� �ϴϱ� ����Ʈ �����ڸ� ����� ���� ����.
	int val;
	public Ex09(int first , int second , int val) {
		super(first , second);
		this.val = val;
	}
	
	public void sub() {
		result = first - second;
	}
	public void mul() {
		result = first * second;
	}
	@Override
	public void div() { // �θ� ���� �޼��带 �ڽĿ��� ������
		
		if (second == 0) {
			result = 0;
		}else {
			result = first / second;
		}
		
	}public void div1() {
		super.div(); // �����ǵ� �θ� Ŭ���� �ִ� �޼��带 ȣ���Ѵ�.
	}
}
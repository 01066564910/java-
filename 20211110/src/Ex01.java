
public class Ex01 {
	// ĸ��ȭ =>����ʵ�+�޼ҵ� (private�� �����ϱ� ���ؼ�)
	// ��� �ʵ� , ��� ����
	
	private int first;
	private int second;
	int result;
	
	public Ex01() {} // default ������
	//�ٸ� �����ڰ� ���� ��� byte�ڵ� ���Ͽ� �ڵ����� ����� ������
	// �ٸ� �����ڰ� �ִ� ��� ����Ʈ �����ڸ� ����� �־�� �Ѵ�.
	// �޼ҵ� 
	public Ex01(int first) { // ������ �����ε�
		this.first = first;
	}
	public Ex01(int first, int second) {
		this.first = first;
		this.second = second;
	}
	public void setFirst(int first) {
		this.first = first;
	}
	public int getFirst() {
		return first;
	}
	public int getSecond() {
		return this.second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	public int getResult() {
		return this.result;
	}
	public void setResult(int result) {
		this.result = result;
		
	}
	public int add() { // �޼��� �����ε�
		return this.first + this.second;
		
	}
	public int add(int num1 , int num2) {
		return num1 + num2;
	}
	public void add(int num1) {
		System.out.println(num1 + this.first);
	}
	
}


public class Ex14 {
	int result;
	int first;
	int second;
	int add; // ����  //�ڿ� ��ȣ�� ������ ���� ��ȣ�� ������ �Լ�
	public Ex14(int first , int second) {
		this.first = first; //(this�� �Ű������� �ѹ��ʵ带 �������ش�.
		this.second=second;
		// public Ex14(int num , int second) {
	//	first = num;                        ???
	//	this.second=second;
	}
	// �޼����� 4���� ����
	// 1.�Է°��� �ְ� ��������� �ִ� �޼���
	//               ���Է°�
	public int add(int num1, int num2) {
		return num1 + num2 ;
	}//     ���ȯ��
	//�޼��� ���� �ε�
	public int div(int num1,int num2) {
		return num1 / num2 ;
	}
	
	//2. �Է°��� �ְ� �������(��ȯ����) ���� �޼���
	             //      ���Է°�

	public void sub(double num1,int num2) {//  <- �޼��� �����ε� �Ű������� ������ �ٸ���
		result = (int)num1 - num2; // result �� �Ű������� ��� �򰥸� ���� ���
										//this �� �� �ٿ��� �ȴ�.
		System.out.println(this.result);
		
		
	} //   ��ȯ���� �ٸ��Ŵ� �ǹ̰� ����
	//    �޼����� ������ �޼����� Ÿ���� �޶�� �Ѵ�.
	// �޼����� �����ε�
	public int sub(int num1 , double num2) {
		return num1 - (int)num2;
	}
	//3. �Է°��� ���� ������� �ִ� �޼���
	public int mul() {
		return this.first * this.second;
	}//   ���ȯ��  return �� �־�� ��ȯ���̴�.
	//4. �Է°��� ���� ������� ���� �Լ�
	public void div() {
		System.out.println(this.first / this.second);
	}
}


public class Ex03 {
	int first; // ��� �ʵ� // this�� �پ������� ����ʵ� �ƴϸ� �Ű�����
	int second; /// ����ʵ�� �Ķ��� �γ��? �� �Ű�����
	int result;
 // ��� �ʵ����� ���� �ִ°��� setter �̶�� �Ѵ�. �� ���� set (��� �ʵ忡�ٰ� ���� �ٶ��� �տ��� �빮��)
	public void setData(int first, int second) {
		this.first = first;
		this.second = second;
// ��� �ʵ����� ���� �޾� ���°��� gerrer ��� �Ѵ�.�׸���  �޾ƿ� �� get
	}

	public void setFirst(int first) {
		this.first = first;
	}
//(void �� �ƹ��͵� ����
	public void setSecond(int second) {
		this.second = second;
	}

// ( 
	public int getFirst() {
		return this.first;
	}
// ( second�� �����̸� double
	public int getsecond() {
		return this.second;
	}

	public void add() {
		this.result = this.first + this.second;
	}

	public void sub() {
		this.result = this.first - this.second;
	}
}
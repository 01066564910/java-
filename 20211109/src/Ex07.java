
public class Ex07 {
  int first;
  int second;
  int result;
  // ����Ʈ ������.
  // �����ڰ� �����ڸ� ����� ����Ʈ �����ڴ� �ڵ�����  ��������� �ʴ´�.
  // �����ڰ� �ִ� ��� ����Ʈ �����ڴ� ��������� ����� ��� �Ѵ�.
  public Ex07() { // ����Ʈ ������ (�⺻ ������)
  System.out.println("����Ʈ ������ ����");
  }
  public Ex07(int firest , int second) {
  	this.first = first;
  	this.second = second;
  }
  public void setFirst(int first) {
	  this.first = first;
	  
  }
  public void setSencond(int second) {
	  this.second = second;
	
  }
  
  public int getFirest() {
	  return this.first;
  }
  public int getSecond() {
	  return this.second;
  }  public int getResult() {
	  return this.result;
  }
  public void add() {
	  this.result = this.first + this.second;
  }
  public void sub() {
	  this.result = this.first - this.second;
  }
}


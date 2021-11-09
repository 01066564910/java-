
public class Ex07 {
  int first;
  int second;
  int result;
  // 디펄트 생성자.
  // 개발자가 생성자를 만들면 디펄트 생성자는 자동으로  만들어지지 않는다.
  // 생성자가 있는 경우 디펄트 생성자는 명시적으로 만들어 줘야 한다.
  public Ex07() { // 디펄트 생성자 (기본 생성자)
  System.out.println("디펄트 생성자 실행");
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


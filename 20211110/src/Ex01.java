
public class Ex01 {
	// 캡슐화 =>멤버필드+메소드 (private를 구분하기 위해서)
	// 멤버 필드 , 멤버 변수
	
	private int first;
	private int second;
	int result;
	
	public Ex01() {} // default 생성자
	//다른 생성자가 없는 경우 byte코드 파일에 자동으로 생기는 생성자
	// 다른 생성자가 있는 경우 디펄트 생성자를 명시해 주어야 한다.
	// 메소드 
	public Ex01(int first) { // 생성자 오버로딩
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
	public int add() { // 메서드 오버로딩
		return this.first + this.second;
		
	}
	public int add(int num1 , int num2) {
		return num1 + num2;
	}
	public void add(int num1) {
		System.out.println(num1 + this.first);
	}
	
}

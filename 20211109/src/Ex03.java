
public class Ex03 {
	int first; // 멤버 필드 // this가 붙어있으면 멤버필드 아니면 매개변수
	int second; /// 멤버필드는 파랑색 부농색? 은 매개변수
	int result;
 // 멤버 필드한테 값을 주는것을 setter 이라고 한다. 줄 때는 set (멤버 필드에다가 값을 줄때는 앞에는 대문자)
	public void setData(int first, int second) {
		this.first = first;
		this.second = second;
// 멤버 필드한테 값을 받아 오는것을 gerrer 라고 한다.그리고  받아올 땐 get
	}

	public void setFirst(int first) {
		this.first = first;
	}
//(void 는 아무것도 없다
	public void setSecond(int second) {
		this.second = second;
	}

// ( 
	public int getFirst() {
		return this.first;
	}
// ( second가 더블이면 double
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
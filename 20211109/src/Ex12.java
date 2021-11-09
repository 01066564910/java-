
public class Ex12 {
		int first;
		int second; 
		
		public void setFirst(int first) {
			this.first = first;
			
		}
	public void setSecond(int second) { 
		this.second=second;
		
	}
	public int add() {
		return this.first + this.second;
		
	}
	public int sub() {
		return this.first - this.second; // return 문 뒤에있는 값이 와야한다 public 앞에
	}
	public String getName() {
		return "이승무";
	}
}

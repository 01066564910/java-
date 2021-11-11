package inheritance;

public class Ex04 {
	int first;
	int second;
	int result;
	
	public void add() {
		result = first + second;
	}
	public void div() {
		result = first / second;
	}
	public void setFirst(int first) {
		this.first = first;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public int getFirst() {
		return first;
	}
	public int getSecond() {
		return second;
	}
	public int getResult() {
		return result;
	}
} 

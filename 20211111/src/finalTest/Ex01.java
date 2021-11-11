package finalTest;

public class Ex01 {
	int first;
	int second;

	public int add() {
		return first + second;
	}

	public final int div() {  // final ¸Þ¼Òµå
		return first / second;
	}

	public int getFirst() {
		return first;
	}

	public void setFirst(int first) {
		this.first = first;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

}

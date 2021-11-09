
public class Ex05 {
	// 캡슐화 (멤버 필드와 메서드를 묶어논것을)  private은 숨심다는 듯이다.
	// 캡슐화 이유 :* 직접 멤버에 접근할 수가 없다.
	//  ex05.age = 20;  멤버의 은닉 때문에  허가된 멤버만 직접 접근할 수 있게끔 하는 것 
	private int age; //접근지정자
	private double heigth;
	String name;
	public void setAge(int age) {
		this.age = age;
	}

	public void setHeight(double height) {
		this.heigth = heigth;
	}

	public int getAge() {
		return this.age;
	}

	public double getHeigth() {
		return this.heigth;
	}

}


public class Ex02test {

	public static void main(String[] args) {
		int i =10;
	// cal = calulator();         cal.first = 10
	// cal1 = calulator();         cal.first = 20 ?
		Ex02    ex02  =  new Ex02();
	//  자료형	변수명 		
	//  		변수명은 소문자로 하자[ 자료형(class)와 헷갈리지 않기 위해서]
		
		ex02.addr = "광명";
		ex02.age = 27;
		ex02.name = "이숭무";
		ex02.gender = false;
		System.out.println(ex02.addr);
		System.out.println(ex02.gender);
		
		Ex02 ex021 = new Ex02();
		ex021.addr = "광명";
		ex021.age = 33;
		ex021.name = "최최최";
		System.out.println(ex021.name);
				
		
	}

}

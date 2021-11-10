
public class Ex02 {

	public static void main(String[] args) {
		int []i = new int[3];
		
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		
		Account ac1 = new Account();
		Account ac2 = new Account();
		Account ac3 = new Account();
	//   자료형     변수    new 객체
		Account[] accs = new Account[3];
		accs[0] = new Account("1111" , "이숭무" , 100); //각각의 값을 받기 위해서? 매개변수 생성자 이용
		accs[1] = new Account(); // 
		String[] str = new String[3];
		str[0] = "이숭무";
		str[1] = "이상범";
		
		
	}

}

package src;

public class Ex03 {

	public static void main(String[] args) {
		int i = 10;
		System.out.println(i);
		// i = "10" ; 문자열
		String str = "10";
		System.out.println(str); /// 문자열인 경우 "" 더블 커텐션 무조건
		//char ch = '10' ;  문자열 (1문자 0문자가 합쳐진 형태)
		char ch = '0'; // 문자인 경우 : '' 싱글 커텐션?   1~9는 문자 10부터는 문자열
		System.out.println(ch);
		ch = '9' ;
		System.out.println(ch);
		ch = 0;
		System.out.println(ch); // 공백문자
		ch = '0'; //48
		System.out.println(ch);
		System.out.println((int)ch);
		// String strl = 'a';
		// char ch1 = "a";
}
}
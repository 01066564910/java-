package src;

public class Ex02 {

	public static void main(String[] args) {
		byte b;
		b = -128;
		System.out.println(b);
		b = -127;
		System.out.println(b);
		//b = -129;
		//b = 128;
		char ch = 0;  // unicode : 정수에 해당하는 문자는
		System.out.println(ch);
		ch=65535;
		System.out.println(ch);
		ch =65; // 대문자 A
		System.out.println(ch);
		ch = 97; // 소문자 = 대문자 + 32
		System.out.println(ch);
		ch = 'A'  + 32;
		System.out.println(ch);
		// char는 문자를 나타내주는 자료형
		ch = '가';
		System.out.println((int)ch);
		ch = 44032;
		short sh = -32768;
		System.out.println(sh);
		sh = 32767;
		System.out.println(sh);
		//sh= -32769;
		//sh= 32768;
		int i = -2147483648;
		System.out.println(i);
		 i = 2147483647;
		System.out.println(i);
		
		float f;
		f=3.14f;
		System.out.println(f);
		double d = 3.4; //8바이트  # 플롯의 경우는 8바이트가 넘으면 뒤에 f를 붙인다.
		System.out.println(d);
		
		long l= 10;
		System.out.println(l);
		l = 20000000000l; // 8byte (2,147,483,647 을 넘는 수는 4바이트보다 큰 수라는걸 나타내기 위해서 
		//                  대문자L이나 소문자 l을 붙여야 인식을 한다.
		System.out.println(l);
		//정수의 기본크기는 4바이트
		//실수는 기본크기는 8바이트
}

}

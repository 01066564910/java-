package StringClass;

public class StringMethod {

	public static void main(String[] args) {
		String ssn = "010624-1230123";
		//  		  01234567890123
		//						1
		
		System.out.println(ssn.charAt(7));
		String str = "나는 자바가 너무 재미있어요.";
		// 			  0 1234567 890 12 34 5 
		//						  1
		
		char ch =ssn.charAt(7);
		switch(ch) {
		case '1' :
		case '3' :System.out.println("남자");break;
		case '2' :
		case '4' : System.out.println("여자");break;
		
		}
	System.out.println(str.charAt(10));
	//charAt(): index에 해당하는 문자를 가져옴.
	
	// 메서드정리 
	String str1 = "apple";
	boolean b1 = str1.startsWith("ap");  // startWith 앞 글자가 뭘로 시작하는지 알고싶을 때
	System.out.println(b1);
	b1 = str1.startsWith("le");
	System.out.println(b1);
	
	b1 = str1.endsWith("le"); // endWith => 뒤에 끝나는 글자가 뭔지
	System.out.println(b1);
	
	str = new String("java");
	str1 = new String("java");
	System.out.println(str1 == str);  // false
	System.out.println(str1.equals(str));
	
	str1 = "I like the java";
	//		012345678901234
	// 				  1
	System.out.println(str1.indexOf("t"));
	System.out.println(str1.indexOf("a"));
	System.out.println(str1.lastIndexOf("a"));
	System.out.println(str1.length()); // 배열 아니면 length() 이렇게 괄호가 있다.
	int [] ii = new int [5];
	System.out.println(ii.length);
	
	// I를 we로 바꾸기
	System.out.println(str1.replace("I", "i"));
	// I 를 you : 정규표현식에 해당하는 문자를 변경
	System.out.println(str1.replaceAll("I", "You"));
	
	str = "A:B:C:D:abcd"; // 문자열을 split을 하면 배열로 저장
	String [] str2 = str.split(":");
	System.out.println(str2[1]);
	str = "A B C D abcd";
	str2 = str.split(" ");
	System.out.println(str2[1]);
	
	//slicing : a = "abcdef" : a[1:3] substring
	
	str1 = "abcdef";
	
	System.out.println(str1.substring(1,1+2));
	
	str = "abcDEF";
	
	System.out.println(str1.toLowerCase());
	System.out.println(str1.toUpperCase());
	
	Integer i =10;
	str = "10" + i.toString() ; // 숫자를 문자로 변경할 때 
	System.out.println(str);
	
	str1 = "abc DEF"; // 파이썬 에서는 strip
	System.out.println(str1.trim());
	
	str1 = "I like the java";
	//      012345678901234
	// 				  1
	int start = str1.indexOf("t");
	System.out.println(str1.substring(start,start + 8));
	
	str = "A:B/C-D,abcd";
	str2 = str.split(":|/|-|,");
	System.out.println(str2[1]);
	
	}

}

package WrapperExample;

public class IntegerWrapperEx {

	public static void main(String[] args) {
		int i = 10;
		String s = "10";
		
		Integer i1 = 10;  // int 랑 같다
		i1 =  Integer.parseInt(s);  // 문자열을 숫자로 저장
		byte by = 10;
		byte by1 = 10;
		
		short sh = 10;  // 일반자료형
		short sh1 = 10; // 렙퍼자료형
		
		double d = 10.5;
		Double d1 = 10.5;
		
		float f = 10.5f;
		float f1 = 10.6f;
		
		//f = null;  // null : 값은 존재하되 어떠한 값인지 모르는 것
		// f1 = null; // 문자열을 숫자로 변화하기도 하지만 null값을 저장하기 위해서 사용도한다.
		
		}

}

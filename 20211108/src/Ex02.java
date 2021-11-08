
public class Ex02 {

	public static void main(String[] args) {
		// 변수 값을 10개를 저장
		// 학새의 수가 10명이라 10개의 정수의 점수를 저장하자.
		int score1 = 20;
		int score2 = 40;
		int score3 = 10;		
		int score4 = 40;
		int score5 = 10;		
		int score6 = 40;
		int score7 = 20;			
		int score8 = 40;
		int score9 = 30;		
		int score10 = 40;	
/// 변수 하나에 10개의 값을 저장하도록 만들자, 배열
		int [] score = {1,2,3,4,5,6,7,8,9,10};
	//  				0 1 2 3 4 5 6 7 8 9
	// python의 리스트는 여러개의 유형의 데이터를 여러 개 저장
	// Java 에서의 배열은 하나의 자료형의 데이터를 여러개 저장 할 수 있다.
		System.out.println(score[5]);
		double [] d = {10.5, 10.5, 12.5, 12.6};  //실수는 실수만 정수는 정수만 저장이 가능하다.
	// 배열을 사용할 때는 indexing을 한다.
		System.out.println(d[3]);
	// 배열의 모든 데이터를 출력
	for(int i = 0; i<=3; i++) {
		System.out.println(d[i]);
	}
		//score에 있는 값을 모두 더하시오.
		int sum = 0;
		for (int i = 0; i<=9; i++) {
			sum += score[i];
		}
		System.out.println(sum);
		
		
		
		//  배열 선업법 
		// []연산자 : 배열로 선언하기 위한 연산자.
		int i []= {10,20,30};
		int j = 10 + 15;
		int i1 []; // 배열 선언
		i1 = new int [] {10,20,30}; // 배열 생성
		int i2 [] = new int [3]; // 배열의 크기 3이다.
		i2[0] = 10;
		i2[1] = 20;
		i2[2] = 30; //3개의 값만 저장
		int i3[];
		i3 = new int[3]; // 배열의 크기 3으로 하겠다.라고 해놨음.
						//          0    1     2      
		i3[0] = 10;  	//  i3 =  | 10 |     |     | 
		i3[1] = 20;		// i3 =   | 10 | 20  |     | 
		i3[2] = 30;   // i3 =     | 10 | 20  |  30 | 
		// 3개의 값만 저장
		System.out.println(i3[2]);
		/* 사용 불가
		 * int i4 [];
		i4 = {10,20,30};
		*/
		int i5[];           //        0    1   2
		i5 = new int[3];  // i5 =   | 0 | 0 |  0|  
		// 배열을 만들게 되면 각 요소는 0으로 초기화가 된다.
		System.out.println(i5[0]);
		System.out.println(i5[1]);
		System.out.println(i5[2]);
		int y; // 변수는 0으로초기화가 되어 있지않다.
		// System.out.println(y);  //초기화가 되어 있지 않아 오류
	}

}

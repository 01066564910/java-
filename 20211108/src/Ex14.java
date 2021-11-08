import java.util.Calendar;

public class Ex14 {

	public static void main(String[] args) {
		Week today; //열거형 상수 변수 선언
		today = Week.MONDAY; // 변수에 열거형 상수값을 대입
		System.out.println(today);
			
			
			
			//사용 예
		// Calendar는 날짜를 사용하기 위한 자료형이다.
		Calendar cal = Calendar.getInstance();
		// 요일을 가지고 오자
		int week = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println(week); //2: 월요일
		switch(week) {
		case 1: today=Week.SUNDAY;break;
		case 2 :today=Week.MONDAY;break;
		case 3 :today =Week.Tuseday;break;
		case 4 :today =Week.WEDNESDAY;break;
		case 5 :today =Week.THURSDAY;break;
		case 6 :today =Week.FRIDAY;break;
		case 7 :today =Week.SATURDAY;break;
		
		
		
		
		
		}System.out.println(week);
	}
}

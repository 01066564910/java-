import java.util.Calendar;

public class Ex14 {

	public static void main(String[] args) {
		Week today; //������ ��� ���� ����
		today = Week.MONDAY; // ������ ������ ������� ����
		System.out.println(today);
			
			
			
			//��� ��
		// Calendar�� ��¥�� ����ϱ� ���� �ڷ����̴�.
		Calendar cal = Calendar.getInstance();
		// ������ ������ ����
		int week = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println(week); //2: ������
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

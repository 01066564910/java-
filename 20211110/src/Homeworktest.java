
import java.util.Scanner;

public class Homeworktest {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int arrayNum = 1;
		Account[] accs = new Account[90];
		boolean bc = true;

		while (bc) {
			System.out.println("1.계좌 등록 | 2. 계좌 목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.print(" 선택> ");
			String abc = sca.nextLine();

			switch (abc) {
			case "1":
				System.out.println("계좌 번호를 입력하세요");
				String accountNo = sca.nextLine();
				System.out.println("예금 주인");
				String master = sca.nextLine();
				System.out.println("금액");
				int balance = sca.nextInt();
				System.out.println("계좌등록이 완료 되었습니다.\n");
				sca.nextLine();
				Account scv = new Account(accountNo,master,balance);
				
				break;
				
				 
			case "2":
				System.out.println("계좌 목록페이지 입니다.");
				System.out.println("계좌번호\t\t 예금주인\t\t 금액\t\t ");
			
				System.out.println("계좌번호\t\t 예금주인\t\t 금액\t\t ");
				break;
			case"3":
				System.out.println("입금 페이지 입니다.");
				System.out.println("입금:");
				break;					
			case"4":
				System.out.println("출금 페이지 입니다.");
				break;
			case"5":
				System.out.println("종료 합니다.");
				bc = false;

			}
		}

	}
	}


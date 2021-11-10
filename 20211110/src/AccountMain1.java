import java.util.Scanner;

public class AccountMain1 {
	static Scanner sc = new Scanner(System.in);
	static int arrayNum = 0; // 배열의 현재 번호를 가지기 위한 변수
	static Account[] accs = new Account[100];

	public static void main(String[] args) {

		/*
		 * Account acc = new Account("1111","이숭무",100); Account acc1 = new
		 * Account("2222","이상범",100); Account acc2 = new Account("3333","이숭무",100);
		 */

		// 배열은 0번부터
		boolean run = true;
		// while(run) {
		do {
			System.out.println("1.계좌 등록 | 2.계좌 목록 | 3.예금 |4. 출금|5. 종료");
			System.out.print("선택 > ");
			int selecNo = sc.nextInt(); // 123456\n 입력값에 값이 있으면 더이상 안 받는다. 없애야 값을 받는다.
			// String selecNo = sc.nextLine() 은 문자열로 받아 오겠다. 이다
			sc.nextLine();// int 로 하면 sc.nextLine() 을 해줘야 한다. 입력 장치에 \n값이 있는 것을 없애기 위해 사용이 된다.

			switch (selecNo) {
			case 1:
				System.out.println("계좌등록 페이지 입니다.");
				System.out.print("계좌 번호 : ");
				String accountNo = sc.nextLine(); // \n
				System.out.print("예금주 : ");
				String owner = sc.nextLine();
				System.out.print("금액 :");
				int money = sc.nextInt();

				accs[arrayNum] = new Account(accountNo, owner, money);
				arrayNum++;
				System.out.println("계좌등록이 완료 되었습니다.\n");
				break;
			case 2:
				System.out.println("계좌목록 페이지 입니다.");
				for (int i = 0; i < accs.length; i++) {
					if (accs[i] == null)
						break;
					System.out.println("계좌 번호\t\t 계좌주 \t\t 금액");
					System.out.println(
							accs[i].getAccountNo() + "\t\t" + accs[i].getOwner() + "\t\t" + accs[i].getBalance());
				}
				break;
			case 3:
				System.out.println("예금 페이지 입니다.");
				System.out.println("계좌번호 : ");
				accountNo = sc.nextLine();
				System.out.println("예금액 : ");
				money = Integer.parseInt(sc.nextLine());
				Account acc = accountFind(accountNo);

				int result = acc.getBalance() + money;
				acc.setBalance(result);
				System.out.println();
				break;
			case 4:
				System.out.println("출금 페이지 입니다.");
				System.out.println("계좌번호 : ");
				accountNo = sc.nextLine();
				System.out.println("예금액 : ");
				money = Integer.parseInt(sc.nextLine());
				acc = null;
				for (int i = 0; i < accs.length; i++) {
					if (accs[i] == null)
						break;
					else {
						if (accs[i].getAccountNo().equals(accountNo)) {
							// 계좌번호가 일치하는 Account를 가지고 와서 acc에 저장
							acc = accs[i];
							// acc = accs[0], acc = accs[1],...
							break;
						}
					}
				}
				result = acc.getBalance() - money;
				acc.setBalance(result);
				System.out.println();
				break;
			case 5:
				System.out.println("프로그램이 종료되었습니다.");
				run = false;
				// break;
				// System.exit(0); // 프로그램 종료
			}
		} while (run);
	}

	public static Account accountFind(String accountNo) {
		for (int i = 0; i < accs.length; i++) {
			if (accs[i] == null)
				break;
			else {
				if (accs[i].getAccountNo().equals(accountNo)) {
					// 계좌번호가 일치하는 Account를 가지고 와서 acc에 저장
					return accs[i];
					// acc = accs[0], acc = accs[1],...
					
				}
			}
		}return null;
	}

}

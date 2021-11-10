import java.util.Scanner;

public class AccountMain1 {
	static Scanner sc = new Scanner(System.in);
	static int arrayNum = 0; // �迭�� ���� ��ȣ�� ������ ���� ����
	static Account[] accs = new Account[100];

	public static void main(String[] args) {

		/*
		 * Account acc = new Account("1111","�̼���",100); Account acc1 = new
		 * Account("2222","�̻��",100); Account acc2 = new Account("3333","�̼���",100);
		 */

		// �迭�� 0������
		boolean run = true;
		// while(run) {
		do {
			System.out.println("1.���� ��� | 2.���� ��� | 3.���� |4. ���|5. ����");
			System.out.print("���� > ");
			int selecNo = sc.nextInt(); // 123456\n �Է°��� ���� ������ ���̻� �� �޴´�. ���־� ���� �޴´�.
			// String selecNo = sc.nextLine() �� ���ڿ��� �޾� ���ڴ�. �̴�
			sc.nextLine();// int �� �ϸ� sc.nextLine() �� ����� �Ѵ�. �Է� ��ġ�� \n���� �ִ� ���� ���ֱ� ���� ����� �ȴ�.

			switch (selecNo) {
			case 1:
				System.out.println("���µ�� ������ �Դϴ�.");
				System.out.print("���� ��ȣ : ");
				String accountNo = sc.nextLine(); // \n
				System.out.print("������ : ");
				String owner = sc.nextLine();
				System.out.print("�ݾ� :");
				int money = sc.nextInt();

				accs[arrayNum] = new Account(accountNo, owner, money);
				arrayNum++;
				System.out.println("���µ���� �Ϸ� �Ǿ����ϴ�.\n");
				break;
			case 2:
				System.out.println("���¸�� ������ �Դϴ�.");
				for (int i = 0; i < accs.length; i++) {
					if (accs[i] == null)
						break;
					System.out.println("���� ��ȣ\t\t ������ \t\t �ݾ�");
					System.out.println(
							accs[i].getAccountNo() + "\t\t" + accs[i].getOwner() + "\t\t" + accs[i].getBalance());
				}
				break;
			case 3:
				System.out.println("���� ������ �Դϴ�.");
				System.out.println("���¹�ȣ : ");
				accountNo = sc.nextLine();
				System.out.println("���ݾ� : ");
				money = Integer.parseInt(sc.nextLine());
				Account acc = accountFind(accountNo);

				int result = acc.getBalance() + money;
				acc.setBalance(result);
				System.out.println();
				break;
			case 4:
				System.out.println("��� ������ �Դϴ�.");
				System.out.println("���¹�ȣ : ");
				accountNo = sc.nextLine();
				System.out.println("���ݾ� : ");
				money = Integer.parseInt(sc.nextLine());
				acc = null;
				for (int i = 0; i < accs.length; i++) {
					if (accs[i] == null)
						break;
					else {
						if (accs[i].getAccountNo().equals(accountNo)) {
							// ���¹�ȣ�� ��ġ�ϴ� Account�� ������ �ͼ� acc�� ����
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
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				run = false;
				// break;
				// System.exit(0); // ���α׷� ����
			}
		} while (run);
	}

	public static Account accountFind(String accountNo) {
		for (int i = 0; i < accs.length; i++) {
			if (accs[i] == null)
				break;
			else {
				if (accs[i].getAccountNo().equals(accountNo)) {
					// ���¹�ȣ�� ��ġ�ϴ� Account�� ������ �ͼ� acc�� ����
					return accs[i];
					// acc = accs[0], acc = accs[1],...
					
				}
			}
		}return null;
	}

}


import java.util.Scanner;

public class Homeworktest {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int arrayNum = 1;
		Account[] accs = new Account[90];
		boolean bc = true;

		while (bc) {
			System.out.println("1.���� ��� | 2. ���� ��� | 3.���� | 4.��� | 5.����");
			System.out.print(" ����> ");
			String abc = sca.nextLine();

			switch (abc) {
			case "1":
				System.out.println("���� ��ȣ�� �Է��ϼ���");
				String accountNo = sca.nextLine();
				System.out.println("���� ����");
				String master = sca.nextLine();
				System.out.println("�ݾ�");
				int balance = sca.nextInt();
				System.out.println("���µ���� �Ϸ� �Ǿ����ϴ�.\n");
				sca.nextLine();
				Account scv = new Account(accountNo,master,balance);
				
				break;
				
				 
			case "2":
				System.out.println("���� ��������� �Դϴ�.");
				System.out.println("���¹�ȣ\t\t ��������\t\t �ݾ�\t\t ");
			
				System.out.println("���¹�ȣ\t\t ��������\t\t �ݾ�\t\t ");
				break;
			case"3":
				System.out.println("�Ա� ������ �Դϴ�.");
				System.out.println("�Ա�:");
				break;					
			case"4":
				System.out.println("��� ������ �Դϴ�.");
				break;
			case"5":
				System.out.println("���� �մϴ�.");
				bc = false;

			}
		}

	}
	}


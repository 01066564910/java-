
public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String location = "��õ";
		if (location.equals("����")) {// if location =="����"
			System.out.println("���� ��������� 1350�� �Դϴ�.");
		}else if(location.equals("��õ")) {// if location =="����"
			System.out.println("��õ ��������� 1350�� �Դϴ�.");
		}else if(location.equals("����")) {// if location =="����"
		System.out.println("���� ��������� 1350�� �Դϴ�.");
		}
		
		System.out.println("===============switch============");
		
		switch (location) {
		case "����" : System.out.println("���� ��������� 1350�� �Դϴ�.");break;
		case "��õ" : System.out.println("��õ ��������� 1350�� �Դϴ�.");break;
		case "����" : System.out.println("���� ��������� 1350�� �Դϴ�.");break;
		}
	}

}


public class LoginMain {

	public static void main(String[] args) {
		LoginMember LoginMember = new LoginMember("highland0","1234");
		int i = LoginMember.login(args[0],args[1]);
		if(i == 1) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			
		}else if(i==0) {
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		
		}else if(i == -1) {
			System.out.println("�����ϴ� ���̵� �����ϴ�.");
		}
	}

}

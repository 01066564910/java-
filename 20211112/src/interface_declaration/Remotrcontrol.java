package interface_declaration;

public interface Remotrcontrol {
// ������ x , �ʵ� x , �Ϲ� �޼��� x
	
 //���
 int MAX_VOLUME = 10;
 int MIN_VOLUME = 9;
 
 
 //�߻� �޼ҵ�
 void turnOn();
 void turnOff();
 void setVolume(int volume);
 //// �ڹ� 8�� ������ �߰�
 // ����Ʈ �޼ҵ�
 default void setMute(boolean mute) {
	 if(mute) {
		 System.out.println(" ���� ó���� �Ѵ�.");
	 }else {
		 System.out.println("���� ������ �Ѵ�.");
	 }
 }
 	//���� �޼ҵ�
static void changeBattery() {
	System.out.println("�������� ��ȯ�մϴ�.");
}
 
 
}

package interface_declaration;

public class Television implements Remotrcontrol {

	private int volume;
	@Override
	public void turnOn() {
		System.out.println("Tv�� ŵ�ϴ�");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Tv�� ���ϴ�.");
		
	}

	@Override
	public void setVolume(int volume) {
	if(volume>Remotrcontrol.MAX_VOLUME) {
		this.volume = Remotrcontrol.MIN_VOLUME;
	}else if(volume<Remotrcontrol.MIN_VOLUME) {
		this.volume = Remotrcontrol.MAX_VOLUME;
	}else {
		System.out.println("���� ����"+ volume);
	}
		
	}

}

package interface_declaration;
//interface �� �߻� �޼���� �̷���� �����Ƿ� �����ؼ� ����Ѵ�.
public class Audio implements Remotrcontrol {

	//�ʵ�
	private int volume;
	@Override
	public void turnOn() {
	System.out.println("Audi�� �մϴ�");
		
	}

	@Override
	public void turnOff() {
	System.out.println("Audi�� ���ϴ�.");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume > Remotrcontrol.MAX_VOLUME) {
		this.volume = Remotrcontrol.MIN_VOLUME;
	}else if(volume < Remotrcontrol.MIN_VOLUME) {
		this.volume =Remotrcontrol.MIN_VOLUME;
	}else {
		this.volume = volume;
	}
		System.out.println("���� Audio ����:" + volume);
	}
}

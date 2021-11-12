package interface_declaration;
//interface 는 추상 메서드로 이루어져 있으므로 구현해서 사용한다.
public class Audio implements Remotrcontrol {

	//필드
	private int volume;
	@Override
	public void turnOn() {
	System.out.println("Audi를 켭니다");
		
	}

	@Override
	public void turnOff() {
	System.out.println("Audi를 끕니다.");
		
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
		System.out.println("현재 Audio 볼륨:" + volume);
	}
}

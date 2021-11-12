package multi_implement;

import interface_declaration.Remotrcontrol;

/// 클래스와 인터페이스 간에는 다중 상속이 된다.
/// 
public class SmartTelevision implements RemoteControl, Searchable {
	
	private int volume;

	@Override
	public void search(String abc) {
		System.out.println(abc + "을 검색합니다.");

	}

	@Override
	public void turnOn() {
		System.out.println("Tv를 킵니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("Tv를 끕니다.");

	}

	@Override
	public void setVolume(int volume) {
		if (volume > Remotrcontrol.MAX_VOLUME) {
			this.volume = Remotrcontrol.MAX_VOLUME;
		} else if (volume < Remotrcontrol.MIN_VOLUME) {
			this.volume = Remotrcontrol.MIN_VOLUME;
		} else {
			System.out.println("헌재 볼륨:" + volume);
		}
	}
}

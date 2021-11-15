package multi_implement;

// ���� ���
public class SmartTelevision implements Searchable, RemotecControl {
	int volume;

	@Override
	public void turnOn() {
		System.out.println("Tv�� �մϴ�.");

	}

	@Override
	public void turnOff() {
		System.out.println("Tv�� ���ϴ�.");

	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemotecControl.MAX_VOLUME) {// ����� Ŭ������ . ���
			this.volume = RemotecControl.MAX_VOLUME;

		} else if (volume < RemotecControl.MIN_VOLUME) {
			this.volume = RemotecControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� TV ���� :" + this.volume);
	}	

	@Override
	public void search(String url) {
		System.out.println(url + "�� �˻��մϴ�.");

	}
	
}

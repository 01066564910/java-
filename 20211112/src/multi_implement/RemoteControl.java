package multi_implement;

public interface RemoteControl {
// ���
	int MAX_VOLUME = 10;
	int MIX_VOLUME = 0;
	// �߻� �޼ҵ�
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}

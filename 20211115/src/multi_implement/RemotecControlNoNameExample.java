package multi_implement;

public class RemotecControlNoNameExample {
// �͸��� : ��ӵ� Ŭ�������� ���� ��� , Ŭ������ ������� �ʰ� ���
	public static void main(String[] args) {
		//�������̽��� �̿��ؼ� ��ü�����ÿ� ������ �ϴ� �� : �͸���
	RemotecControl rc = new RemotecControl() {
		
		 int volume;

		@Override
		public void turnOn() {
			System.out.println("TV�� �Ѵ�.");
			
		}
		
		@Override
		public void turnOff() {
			System.out.println("tv�� ����");
			
		}
		
		@Override
		public void setVolume(int volume) {
			if(volume > RemotecControl.MAX_VOLUME) {// ����� Ŭ������ . ���
				this.volume = RemotecControl.MAX_VOLUME;
				
			}else if(volume < RemotecControl.MIN_VOLUME) {
				this.volume = RemotecControl.MIN_VOLUME;
			}else{
				this.volume = volume;
			}	
			System.out.println("���� TV ���� :" + this.volume);
			
		}
	};
	rc.turnOn();
	rc.turnOff();

	
		
	}
}

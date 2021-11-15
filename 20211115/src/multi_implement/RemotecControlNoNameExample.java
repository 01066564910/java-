package multi_implement;

public class RemotecControlNoNameExample {
// 익명구현 : 상속된 클래스명이 없이 사용 , 클래스에 상속하지 않고 사용
	public static void main(String[] args) {
		//인터페이스를 이용해서 객체생성시에 재정의 하는 것 : 익명구현
	RemotecControl rc = new RemotecControl() {
		
		 int volume;

		@Override
		public void turnOn() {
			System.out.println("TV를 켜다.");
			
		}
		
		@Override
		public void turnOff() {
			System.out.println("tv를 끄다");
			
		}
		
		@Override
		public void setVolume(int volume) {
			if(volume > RemotecControl.MAX_VOLUME) {// 상수는 클래스명 . 상수
				this.volume = RemotecControl.MAX_VOLUME;
				
			}else if(volume < RemotecControl.MIN_VOLUME) {
				this.volume = RemotecControl.MIN_VOLUME;
			}else{
				this.volume = volume;
			}	
			System.out.println("현재 TV 볼륨 :" + this.volume);
			
		}
	};
	rc.turnOn();
	rc.turnOff();

	
		
	}
}

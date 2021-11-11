
public class Singleton {
	int frist;
	int second;
	// 싱글톤 
	 static     int     val       =               10;
	 private static Singleton singleton = new Singleton(); // 30000
	// ↑자기 자신을 리턴하기 위해서
	 // 자기 자신의 객체를 미리 만들어 놓고 사용
	 // 1. 자기자신의 객체를 만들기 위해서는 1번 private가 있어야 하고 
	 // 2. 자기 자신을 리턴하기 위해서 getInstance 라는 객체를 만들어서 사용하자! 라는 뜻이다.
	 // getInstance 라는 개발자끼리의 약속이다.(자기 자신의 객체를 전달할 떄)
	private Singleton() {}
	public static Singleton getInstance() { // 자신의 객체를 전달
		return singleton;
	}

	///싱글톤 용도로
	public int getFrist() {
		return frist;
	}
	public void setFrist(int frist) {
		this.frist = frist;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	public static Singleton getSingleton() {
		return singleton;
	}
	public static void setSingleton(Singleton singleton) {
		Singleton.singleton = singleton;
	}
	
}


public class Singleton {
	int frist;
	int second;
	// �̱��� 
	 static     int     val       =               10;
	 private static Singleton singleton = new Singleton(); // 30000
	// ���ڱ� �ڽ��� �����ϱ� ���ؼ�
	 // �ڱ� �ڽ��� ��ü�� �̸� ����� ���� ���
	 // 1. �ڱ��ڽ��� ��ü�� ����� ���ؼ��� 1�� private�� �־�� �ϰ� 
	 // 2. �ڱ� �ڽ��� �����ϱ� ���ؼ� getInstance ��� ��ü�� ���� �������! ��� ���̴�.
	 // getInstance ��� �����ڳ����� ����̴�.(�ڱ� �ڽ��� ��ü�� ������ ��)
	private Singleton() {}
	public static Singleton getInstance() { // �ڽ��� ��ü�� ����
		return singleton;
	}

	///�̱��� �뵵��
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

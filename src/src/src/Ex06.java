package src;

public class Ex06 {

	public static void main(String[] args) {
		// ������ �⺻������ 4byte(����Ʈ)
		short sh1 = 32767;
		short sh2 = 32767;
		int sh3 = sh1 + sh2; // short ==> int �ڵ�����ȯ�� �ȴ�.
		//   	    ���� + ����
		//         4byte + 4byte = 4byte
		short sh4 = 10;
		short sh5 = 20;
		int sh6 = sh4 + sh5;
		System.out.println(sh6);
		
		short sh7 = (short)(sh4 + sh5);
		System.out.println(sh7);
		int i = (short)sh4 + (short)sh5;
		//  4byte ��-> 2byte �ٲٰ� �ٽ� ->  �ٲ㼭 4byte �� �ȴ�.
		
		int i1 = 10;
		int i2 = 3;
		double d1 =i1/i2;
		//         4����Ʈ/4����Ʈ=10/3 = 3
		System.out.println(d1);
		d1 = (double) i1/i2;
		//      8byte / 4byte => 8byte / 8byte
		System.out.println(d1);
		
		
		float f1 = 3.5f;
		float f2 = 3.4f;
		float f3 = f1 + f2; //# �Ǽ��� ��쿡 4����Ʈ ���� ������ �����ϴ�.
		
		System.out.println(f3);
		double d4 = 3.8;
		double d5 = f1 + d4;
		System.out.print(d5);
		double d6 = 3.5+4; //8byte + 4 byte => 8byte + 8byte
		System.out.print(d6);
		
		short sh =-127;
		int ss = -sh; // --127
		System.out.println(ss);
		
	}

}

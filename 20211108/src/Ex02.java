
public class Ex02 {

	public static void main(String[] args) {
		// ���� ���� 10���� ����
		// �л��� ���� 10���̶� 10���� ������ ������ ��������.
		int score1 = 20;
		int score2 = 40;
		int score3 = 10;		
		int score4 = 40;
		int score5 = 10;		
		int score6 = 40;
		int score7 = 20;			
		int score8 = 40;
		int score9 = 30;		
		int score10 = 40;	
/// ���� �ϳ��� 10���� ���� �����ϵ��� ������, �迭
		int [] score = {1,2,3,4,5,6,7,8,9,10};
	//  				0 1 2 3 4 5 6 7 8 9
	// python�� ����Ʈ�� �������� ������ �����͸� ���� �� ����
	// Java ������ �迭�� �ϳ��� �ڷ����� �����͸� ������ ���� �� �� �ִ�.
		System.out.println(score[5]);
		double [] d = {10.5, 10.5, 12.5, 12.6};  //�Ǽ��� �Ǽ��� ������ ������ ������ �����ϴ�.
	// �迭�� ����� ���� indexing�� �Ѵ�.
		System.out.println(d[3]);
	// �迭�� ��� �����͸� ���
	for(int i = 0; i<=3; i++) {
		System.out.println(d[i]);
	}
		//score�� �ִ� ���� ��� ���Ͻÿ�.
		int sum = 0;
		for (int i = 0; i<=9; i++) {
			sum += score[i];
		}
		System.out.println(sum);
		
		
		
		//  �迭 ������ 
		// []������ : �迭�� �����ϱ� ���� ������.
		int i []= {10,20,30};
		int j = 10 + 15;
		int i1 []; // �迭 ����
		i1 = new int [] {10,20,30}; // �迭 ����
		int i2 [] = new int [3]; // �迭�� ũ�� 3�̴�.
		i2[0] = 10;
		i2[1] = 20;
		i2[2] = 30; //3���� ���� ����
		int i3[];
		i3 = new int[3]; // �迭�� ũ�� 3���� �ϰڴ�.��� �س���.
						//          0    1     2      
		i3[0] = 10;  	//  i3 =  | 10 |     |     | 
		i3[1] = 20;		// i3 =   | 10 | 20  |     | 
		i3[2] = 30;   // i3 =     | 10 | 20  |  30 | 
		// 3���� ���� ����
		System.out.println(i3[2]);
		/* ��� �Ұ�
		 * int i4 [];
		i4 = {10,20,30};
		*/
		int i5[];           //        0    1   2
		i5 = new int[3];  // i5 =   | 0 | 0 |  0|  
		// �迭�� ����� �Ǹ� �� ��Ҵ� 0���� �ʱ�ȭ�� �ȴ�.
		System.out.println(i5[0]);
		System.out.println(i5[1]);
		System.out.println(i5[2]);
		int y; // ������ 0�����ʱ�ȭ�� �Ǿ� �����ʴ�.
		// System.out.println(y);  //�ʱ�ȭ�� �Ǿ� ���� �ʾ� ����
	}

}


public class Ex04 {

	public static void main(String[] args) {
		// �迭�� ũ�� �������� (�迭��.length)
		int i [] = new int[] {1,2,3,4,5};
		//                    0 1 2 3 4
		System.out.println(i.length);
		//�迭�� �ִ� ���� �հ踦 ���Ͻÿ�.
		int sum = 0;
		for(int j = 0; j < i.length; j++) {
			sum+=i[j];
		}System.out.println(sum);
		
		///ũ�Ⱑ 10�� �迭�� ����� Math.random�� �̿��Ͽ�
		/// �迭�� ������ ���� �����Ͻÿ�
		System.out.println("=======================");
		 int a [] = new int [] {1,2,3,4,5,6,7,8,9,0};
		 for( int b=0; b<a.length; b++ ) {
			 a[b] = (int)(Math.random() *100)+1;
		/*
	 * a�� 0���� 9���� ������ ���� ���� 
	 * a[0] = (int)(Math.random() *100)+1; 
	 * a[1] = (int)(Math.random() *100)+1; 
	 * a[2] = (int)(Math.random() *100)+1;
	 * a[3] = (int)(Math.random() *100)+1; 
	 * ...
	 * a[9] = (int)(Math.random() *100)+1;
	 */
			 
					 
		 }for(int b=0; b<a.length; b++) {
			 System.out.println(a[b]);
			 sum += a[b];
		 }System.out.println(sum);

		 
		 
		 
		 
		 
		 
		 
		 
	}

}

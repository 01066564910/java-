
public class Ex04 {

	public static void main(String[] args) {
		// 배열의 크기 가져오기 (배열명.length)
		int i [] = new int[] {1,2,3,4,5};
		//                    0 1 2 3 4
		System.out.println(i.length);
		//배열에 있는 값의 합계를 구하시오.
		int sum = 0;
		for(int j = 0; j < i.length; j++) {
			sum+=i[j];
		}System.out.println(sum);
		
		///크기가 10인 배열을 만들고 Math.random을 이용하여
		/// 배열에 임의의 값을 저장하시오
		System.out.println("=======================");
		 int a [] = new int [] {1,2,3,4,5,6,7,8,9,0};
		 for( int b=0; b<a.length; b++ ) {
			 a[b] = (int)(Math.random() *100)+1;
		/*
	 * a가 0부터 9까지 임의의 값을 저장 
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

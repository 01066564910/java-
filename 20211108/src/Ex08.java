
public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int i0 = 1;
 int i1 = 2;
 int i2 = 2;
 int i3 = 3;
 int i4 = 4;
 int i[] = {1,2,3,4};// 배열/ 1차원 배열 
 //         0 1 2 3 
 	System.out.println(10); // i[0]
 	int ii[] =  {10,20,30,40};
 	int iii[] = {11,22,33,44};
 	int y[][] =  new int[3][];
 	
 	/*y[3][1]
 	i = 1,  2,  3, 4  : y[0]
 	ii = 10,20,30,40  : y[1]
 	iii = 11,22,33,44 : y[2]
 	*/	
 	y[0] = i;  ///2차 배열은 1차 함 배열을 모아둔 것이다.
 	y[1] = ii;
 	y[2] = iii;
 	System.out.println(i[0]);
 	System.out.println(y[0][0]);
	System.out.println(ii[0]);
	System.out.println(y[1][0]);
	System.out.println(iii[0]);
	System.out.println(y[2][0]);
	
	
	
	
	
	
	
	
	}

}

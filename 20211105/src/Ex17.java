
public class Ex17 {

	public static void main(String[] args) {
		// 1~ 100까지 합을 구하는데 짝수만 더하시오.
		int sum = 0;
		for(int i = 1; i<=100; i ++) {
			sum += i;
		
			if (sum %2 !=0)continue;
			
		}
		System.out.println(sum);
		
		System.out.println("===============");
		sum = 0;
		int i =1;
		while(i<=100) {
			sum += i;
			i++;
			if (sum %2 ==0);
			}System.out.println(sum);
			
		System.out.println("==============");
		sum=0;
		i =1;
		while (true) {
			sum+=i;
			i+=1;
		if (i>100)break;
					
		}System.out.println(sum);
			

		
}
}
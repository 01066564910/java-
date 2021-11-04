package src;

public class Ex14 {

	public static void main(String[] args) {
		// num = random.randint(0,10)
		int num = (int)(Math.random()*6) + 1;// 0~0.99990 *6 => +1을 하면 1~6?
		if (num == 1) {
			System.out.println("1입니다.");
		}else if(num ==2) {
			System.out.println("2입니다");
		}else if(num ==3) {
			System.out.println("3입니다");
		}else if(num ==4) {
			System.out.println("4입니다");
		}else if(num ==5) {
			System.out.println("5입니다");
		}else if(num ==6) {
			System.out.println("6입니다");
		}
			System.out.println("===============");
			/// 95이면 'A',90이면 'A' ....
			int score = 75;
			if (score>=90) {
			  if(score>=95) {
				System.out.println("A+");
			} if(score>=85) {
				System.out.println("A");
			}else if(score>=80) {
				System.out.println("B+");
			}else if(score>=75) {
				System.out.println("B");
			}else if(score>=85) {
				System.out.println("C+");
			}else if(num ==6) {
				System.out.println("C");
			}else if(num ==6) {
				System.out.println("D+");
			}else if(num ==6) {
				System.out.println("D");
			}else if(num ==6) {
				System.out.println("F");
	}
	}		

}
}
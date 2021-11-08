
public class Ex16 {

	public static void main(String[] args) {
		int [] i = {1,2,3,4,5,6};
		String [] str = {"이숭무" , " 이상범" , "이장범", " 김찬중"};
		double [] d = {10.5, 20.6, 40.7 , 200.8};
		WEEK1 []days = WEEK1.values();
		String[][] locations = {{"영등포","노랑진","종로"},
				{"가","나","다"},
				{"모란","수내","미금"}};
		int [][] vals = {{1,2,3},{4,5},{6,7,8,9}};
		/// for문과 for each 문 두가지 방법을 사용해서 출력하시오.		
		
		for(int a=0; a<i.length; a++){
		 System.out.print(i[a]);
	
		
			 
		 }
		System.out.println();
		for(int a:i) {
			System.out.println (a);
		}
		for(int a=0; a<str.length; a++) {
			System.out.println(str[a]);
		}
		for(String a:str) {
			System.out.println(a);
		
		}
		for(int a=0; a<d.length ; a++) {
			System.out.println(d[a]);
		}
		for(double a:d) {
			System.out.println(a);
		}
		
		for(int a=0; a<days.length; a++) {
		System.out.println(days[a]);
		
		}
		for(WEEK1 b:days) {
			System.out.println(b);
		}
		for(int a=0; a<locations.length; a++) {
		System.out.println(locations[a][2]);	
		}
		System.out.println("=====================");
		for(String []a:locations) {
		System.out.println(a[1]);
		}
		for(int a=0;  a<vals.length; a++) {
			System.out.println(vals[a][1]);
		}
		for(int []a:vals) {
			System.out.println(a[1]);
		}
		
		
		
		
		
		
		
		
		

}
}
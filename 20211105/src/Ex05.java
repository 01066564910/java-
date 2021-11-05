
public class Ex05 {

	public static void main(String[] args) {
		// 95이상이면 A+ 90이상이면 A 85이상이면 B+ 80이상이면 B
		int socre = 87;
		if (socre >= 95) { // if (score <= 100 && score >=95)
			System.out.println("A+");
		} else if (socre >= 90) { // if (score < 95 && score >=90)
			System.out.println("A");
		} else if (socre >= 85) { // if (score < 90 && score >=85)
			System.out.println("B+");
		} else if (socre >= 80) { // if (score < 85 && score >=80)
			System.out.println("B");
		}

		System.out.println("=========Swicth========");
		switch (socre) {
		case 100:case 99:case 98:case 97:case 96:
			case 95: System.out.println("A+");break;
		case 94:case 93:case 92:case 91:
			case 90: System.out.println("A");break;
		case 89:case 88:case 87:case 86:
			case 85: System.out.println("B+");break;
		case 84:case 83:case 82:case 81:
			case 80: System.out.println("B");break;
		default : System.out.println("F");

		
		
		switch (socre) {
		case 100:case 99:case 98:case 97:case 96:
			case 95: System.out.println("A+");break;
		case 94:case 93:case 92:case 91:
			case 90: System.out.println("A");break;
			default : System.out.println("F");break;
		case 89:case 88:case 87:case 86:
			case 85: System.out.println("B+");break;
		case 84:case 83:case 82:case 81:
			case 80: System.out.println("B");
		
		}
		}

	}
}

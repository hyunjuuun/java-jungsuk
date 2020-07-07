
public class Ex4_7 {

	public static void main(String[] args) {
		int num = 0;
		
		// Quiz 1. 1~10 사이의 난수를 20개 출력하시오.
//		for (int i = 1; i <= 20; i++) {
//			System.out.println((int)(Math.random()*10) + 1);
//		}
		
		// Quiz 2. -5~5사이의 난수를 20개 출력하시오.
		for (int i = 1; i <= 20; i++) {
			System.out.println((int)(Math.random()*11)-5); // -5<=x<6
		}
		
	}

}

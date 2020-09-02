import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		System.out.print("소수 찾기:숫자 몇까지 조사해볼까요?> ");
		int n = kb.nextInt();

		for (int i = 2; i <= n; i++) {

			boolean isPrime = true;

			for (int j = 2; j * j <= i && isPrime; j++) {
				if (i % j == 0) {
					isPrime = false;
				}
			}
			if(isPrime) {
				System.out.println(i);
			} 
		}

	}

}

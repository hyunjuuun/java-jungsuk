
public class Code10 {

	public static void main(String[] args) {


		// 2, 3, ..., sqrt(n)

		for (int n = 2; n <= 50; n++) {

			boolean isPrime = true;

			for (int i = 2; i * i <= n && isPrime; i++) {
				if (n % i == 0) {
					isPrime = false;
				}
			}

			if (isPrime)
				System.out.println(n);
		}
	}

}

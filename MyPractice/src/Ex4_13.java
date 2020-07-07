
public class Ex4_13 {

	public static void main(String[] args) {
		
		// 1~n 까지의 합이 100을 넘지 않는 정수 n의 최댓값 찾기
		
		int sum = 0;
		int i = 0;
		// i를 1씩 증가시켜서 sum에 계속 더해나간다.
		while(sum<=100) {
			System.out.printf("%d = %d%n", i, sum);
			sum += ++i;
		}

	}

}

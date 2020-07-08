import java.util.*;

public class MatchingNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int value = (int) (Math.random() * 100 + 1);

		System.out.print("1부터 100까지의 수 중 하나를 입력하세요.> ");
		int key = scanner.nextInt();
		int count = 1;
		
		while(key != value) {
			if(key>value) {
				System.out.print("더 작은 수를 입력하세요.> ");
				count ++;
			}
			else if(key<value) {
				System.out.print("더 큰 수를 입력하세요.> ");
				count ++;
			}
			key = scanner.nextInt();
		}
		System.out.print("정답입니다! ("+count+"회)");

	}

}

import java.util.*;
public class SumNum {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요.> ");
		String value = scanner.nextLine();
		int sum = 0;
		int num = Integer.parseInt(value);
		
		while(num != 0) {
			sum += num%10;
			num /= 10;
		}
		
		System.out.println("숫자들의 합계는 "+sum+"입니다.");
		
		// 한 번 더 풀기
		
	}

}

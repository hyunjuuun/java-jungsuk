import java.util.*;
public class SumNum {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է����ּ���.> ");
		String value = scanner.nextLine();
		int sum = 0;
		int num = Integer.parseInt(value);
		
		while(num != 0) {
			sum += num%10;
			num /= 10;
		}
		
		System.out.println("���ڵ��� �հ�� "+sum+"�Դϴ�.");
		
		// �� �� �� Ǯ��
		
	}

}

import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է����ּ���.>");
		String tmp = scanner.nextLine();
		int num = Integer.parseInt(tmp);
		
		int sum = 0;
		
		while(num!=0) {
			sum += num%10;
			num /= 10;
		}
		
		System.out.println("���ڵ��� �հ�� "+sum+"�Դϴ�.");
		
		
		
		}
}

import java.util.*;

public class MatchingNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int value = (int) (Math.random() * 100 + 1);

		System.out.print("1���� 100������ �� �� �ϳ��� �Է��ϼ���.> ");
		int key = scanner.nextInt();
		int count = 1;
		
		while(key != value) {
			if(key>value) {
				System.out.print("�� ���� ���� �Է��ϼ���.> ");
				count ++;
			}
			else if(key<value) {
				System.out.print("�� ū ���� �Է��ϼ���.> ");
				count ++;
			}
			key = scanner.nextInt();
		}
		System.out.print("�����Դϴ�! ("+count+"ȸ)");

	}

}

package hyunjuuun.java;

public class VarEx3 {

	public static void main(String[] args) {
		final int score = 100;
//		score = 200;
//		ctrl + / �� ���� ���� �ּ� ó��

		byte b = 127; // byte Ÿ���� �������� -128 ~ 127

		int oct = 010; // 8����, 10������ 8
		int hex = 0x10; // 16����, 10������ 16

		long l = 10_000_000_000L; // 20���� �Ѿ�� ���̻� L�� ���δ�.

		float f = 3.14f; // float�� ���̻� f�� ���δ�.
		double d = 3.14; // ���̻� ���� ����, f �ٿ��� ����
		System.out.println(10.); // 10.0
		System.out.println(.10); // 0.1
		System.out.println(10f); // 10.0
		System.out.println(1e3); // 1000.0

		char ch = 'A';
		int i = 'A';

		String str = ""; // �� ���ڿ� (empty string)
		String str2 = "ABCD";
		String str3 = "123";
		String str4 = str2 + str3;
		
		System.out.println(""+7+7);
		System.out.println(7+7+"");
	}

}

package hyunjuuun.java;

public class VarEx3 {

	public static void main(String[] args) {
		final int score = 100;
//		score = 200;
//		ctrl + / 로 라인 단위 주석 처리

		byte b = 127; // byte 타입의 변수에는 -128 ~ 127

		int oct = 010; // 8진수, 10진수로 8
		int hex = 0x10; // 16진수, 10진수로 16

		long l = 10_000_000_000L; // 20억을 넘어가면 접미사 L을 붙인다.

		float f = 3.14f; // float는 접미사 f를 붙인다.
		double d = 3.14; // 접미사 생략 가능, f 붙여도 가능
		System.out.println(10.); // 10.0
		System.out.println(.10); // 0.1
		System.out.println(10f); // 10.0
		System.out.println(1e3); // 1000.0

		char ch = 'A';
		int i = 'A';

		String str = ""; // 빈 문자열 (empty string)
		String str2 = "ABCD";
		String str3 = "123";
		String str4 = str2 + str3;
		
		System.out.println(""+7+7);
		System.out.println(7+7+"");
	}

}

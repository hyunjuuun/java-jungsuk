
public class Ex3_11 {

	public static void main(String[] args) {
		// Math.round() 실수를 소수점 첫 째자리에서 반올림한 정수를 반환
		double pi = 3.141592;
		double shortPi = Math.round(pi * 1000)/1000.0;
		System.out.println(shortPi);
		
		// 3.141을 얻고 싶다면?
		
		System.out.println(pi*1000);
		System.out.println((int)(pi*1000));
		System.out.println((int)(pi*1000)/1000.0);
	}

}

import java.util.Arrays;

public class Ex5_String {

	public static void main(String[] args) {
		String[] strArr = {"����", "����", "��"};
		System.out.println(Arrays.toString(strArr));
		
		int num = (int)(Math.random()*strArr.length);
		System.out.println(strArr[num]);
	}

}

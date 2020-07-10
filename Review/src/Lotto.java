
public class Lotto {

	public static void main(String[] args) {
		System.out.println("행운의 번호는 바로");
		
		int[] numbers = new int[45];
		
		for(int i=0;i<numbers.length;i++) {
			numbers[i] = i+1; // 1부터 45까지 숫자
		}
		
		int tmp = 0;
		int j = 0;
		
		for(int i=0; i<6; i++) {
			tmp = numbers[i];
			j = (int)(Math.random()*45);
			numbers[i] = numbers[j];
			numbers[j] = tmp;
			System.out.print(numbers[i]+" ");
		}
	}

}

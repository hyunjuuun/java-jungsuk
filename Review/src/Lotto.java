
public class Lotto {

	public static void main(String[] args) {
		System.out.println("����� ��ȣ�� �ٷ�");
		
		int[] numbers = new int[45];
		
		for(int i=0;i<numbers.length;i++) {
			numbers[i] = i+1; // 1���� 45���� ����
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

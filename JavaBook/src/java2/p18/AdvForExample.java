package java2.p18;

public class AdvForExample {
	public static void main(String[] args) {
		int[] scores = {9, 7, 8, 9, 8, 12, 11, 23, 25, 7};
		int sum = 0;
		for(int s : scores) {
			sum += s;
		}
		System.out.println("sum : " + sum);
		
		for (int i = 0; i < 5; i++) {
			System.out.print(scores[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
		}
		System.out.println();
	}

}

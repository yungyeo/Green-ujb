package Q9054;

public class Main {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 4; j++) {
				sum = j * i;
				System.out.printf("%d * %d = %2d   ", j, i, sum);
			}
			System.out.println("");
		}
	}
}
package Q131;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = sc.nextInt();
		int max = sc.nextInt();

		if (max < min) {
			for (int j = max; j <= min; j++) {
				System.out.print(j + " ");
			}
		} else {
			for (int i = min; i <= max; i++) {
				System.out.print(i + " ");
			}
		}
		sc.close();
	}
}

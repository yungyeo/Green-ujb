package Q139;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int gugu = sc.nextInt();
		int dan = sc.nextInt();
		sc.close();

		if (gugu > dan) {
			for (int i = 1; i <= 9; i++) {
				for (int j = gugu; j >= dan; j--) {
					System.out.printf("%d * %d = %2d   ", j, i, j * i);
				}
				System.out.println();
			}
		} else {
			for (int i = 1; i <= 9; i++) {
				for (int j = gugu; j <= dan; j++) {
					System.out.printf("%d * %d = %2d   ", j, i, j * i);
				}
				System.out.println();
			}
		}
	}
}
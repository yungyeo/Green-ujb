package Q1291;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum1 = 0;
		int sum2 = 0;

		while (true) {
			int inp1 = sc.nextInt();
			int inp2 = sc.nextInt();

			if (inp1 >= 10 || inp2 >= 10 || inp1 <= 1 || inp2 <= 1) {
				System.out.println("INPUT ERROR!");
			} else {
				if (inp1 < inp2) {
					for (int i = 1; i <= 9; i++) {
						for (int j = inp1; j <= inp2; j++) {
							sum1 = j * i;
							System.out.printf("%d * %d = %2d   ", j, i, sum1);
						}
						System.out.println();
					}
				} else {
					for (int v = 1; v <= 9; v++) {
						for (int w = inp1; w >= inp2; w--) {
							sum2 = w * v;
							System.out.printf("%d * %d = %2d   ", w, v, sum2);
						}
						System.out.println();
					}
				}
				sc.close();
				break;
			}
		}
	}
}

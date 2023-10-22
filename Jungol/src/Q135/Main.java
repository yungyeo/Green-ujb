package Q135;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp1 = sc.nextInt();
		int inp2 = sc.nextInt();
		int sum = 0, cnt = 0;
		sc.close();

		if (inp1 < inp2) {
			for (int i = inp1; i <= inp2; i++) {

				if (i % 3 == 0 || i % 5 == 0) {
					sum += i;
					cnt++;
				}
			}
		} else {
			for (int i = inp2; i <= inp1; i++) {

				if (i % 3 == 0 || i % 5 == 0) {
					sum += i;
					cnt++;
				}
			}
		}
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f", (double) sum / cnt);
	}
}
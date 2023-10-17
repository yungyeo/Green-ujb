package Q546;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		int sum = 0;

		for (int i = 0; i < inp; i++) {
			int avg = sc.nextInt();
			sum += avg;
		}
		double av = (double)sum / inp;
		System.out.printf("avg : %.1f\n", av);

		if (av >= 80) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
		sc.close();
	}
}

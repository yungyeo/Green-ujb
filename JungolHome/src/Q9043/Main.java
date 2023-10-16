package Q9043;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int c = 0;

		while (true) {
			int inp = sc.nextInt();

			if (inp % 2 != 0) {
				sum += inp;
				c++;
			} else if (inp == 0) {
				break;
			}
		}
		System.out.println("홀수의 합 = " + sum);
		System.out.println("홀수의 평균 = " + sum / c);

		sc.close();
	}
}

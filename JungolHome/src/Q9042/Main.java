package Q9042;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int sum = 0;

		while (true) {
			int inp = sc.nextInt();
			cnt++;
			sum += inp;

			if (inp == 0) {
				cnt--;
				break;
			}
		}
		System.out.println("입력된 자료의 개수 = " + cnt);
		System.out.println("입력된 자료의 합계 = " + sum);
		System.out.printf("입력된 자료의 평균 = %.2f", (double) sum / cnt);

		sc.close();
	}
}

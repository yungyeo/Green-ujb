package Q157;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp[] = new int[100];
		int cnt = 0;
		int sum = 0;
		double avg;

		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();

			if (inp[i] == 0) {
				break;
			} else if (inp[i] % 5 == 0) {
				cnt++;
				sum += inp[i];
			}
		}

		System.out.println("Multiples of 5 : " + cnt);
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f", (double) sum / cnt);
		sc.close();
	}
}
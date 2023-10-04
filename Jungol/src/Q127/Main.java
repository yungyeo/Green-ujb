package Q127;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int cnt = 0;
		double avg = 0.0;

		while (true) {
			int inp = sc.nextInt();
			cnt++;

			if (inp >= 101 || inp <= -1) {
				break;
			} else if (inp >= 0 && inp < 101) {
				sum += inp;
				avg = (double) sum / cnt;
			}
		}

		/*
		boolean b = true;
		while (b) {
			int inp = sc.nextInt();

			if (0 <= inp && inp <= 100) {
				cnt++;
				sum += inp;
			} else {
				b = false;
			}
		}
		*/
		
		System.out.println("sum : " + sum);
		System.out.print("avg : ");
		System.out.printf("%.1f", avg);
		sc.close();
	}
}

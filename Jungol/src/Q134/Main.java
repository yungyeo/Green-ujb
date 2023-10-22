package Q134;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[10];
		int cnt1 = 0, cnt2 = 0;

		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();

			if (inp[i] % 2 == 0) {
				cnt1++;
			} else {
				cnt2++;
			}
		}
		System.out.println("even : " + cnt1);
		System.out.println("odd : " + cnt2);
		sc.close();
	}
}

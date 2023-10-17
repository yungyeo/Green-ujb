package Q545;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[10];
		int cnt1 = 0;
		int cnt2 = 0;

		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();

			if (inp[i] % 3 == 0) {
				cnt1++;
			}
			if (inp[i] % 5 == 0) {
				cnt2++;
			}
		}
		System.out.println("Multiples of 3 : " + cnt1);
		System.out.println("Multiples of 5 : " + cnt2);
		sc.close();
	}
}

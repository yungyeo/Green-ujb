package Q561;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[10];
		int min = 10000, max = 1;

		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();

			if (inp[i] > 100) {
				if (min > inp[i]) {
					min = inp[i];
				}
			} else if (inp[i] < 100) {
				if (max < inp[i] || inp[i] != 100) {
					max = inp[i];
					max = 100;
				}
			}
		}
		System.out.println(max + " " + min);
		sc.close();
	}
}

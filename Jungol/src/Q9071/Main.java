package Q9071;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[10];
		int max = inp[0];
		int min = inp[0];

		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();

			if (inp[i] % 2 == 0 && inp[i] > max) {
				max = inp[i];
			}

			if (inp[i] % 2 != 0 && inp[i] < min) {
				min = inp[i];
			}
		}
		sc.close();
		System.out.print(min + " ");
		System.out.print(max);
	}
}

package Q9070;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[10];
		int max = 0;

		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();

			if (inp[i] > max) {
				max = inp[i];
			}
		}
		System.out.println(max);
		sc.close();
	}
}

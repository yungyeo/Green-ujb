package Q133;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] inp = new int[n];
		double sum = 0.0;

		for (int i = 0; i < n; i++) {
			inp[i] = sc.nextInt();
			sum += inp[i];
		}
		System.out.printf("%.2f", sum / n);
		sc.close();
	}
}

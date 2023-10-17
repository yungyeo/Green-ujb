package Q9052;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[5];
		int sum = 0;
		int cnt = 0;

		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();
			sum += inp[i];
			cnt++;
		}
		System.out.println("총점 : " + sum);
		System.out.printf("평균 : %.1f", (double) sum / cnt);
	}
}

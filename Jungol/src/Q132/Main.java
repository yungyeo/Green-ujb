package Q132;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		int sum = 0;
		sc.close();

		for (int i = 1; i <= inp; i++) {
			if (i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}

package Q573;

import java.util.Scanner;

public class Main {
	public static int run(int n) {
		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				sum++;
				System.out.print(sum + " ");
			}
			System.out.println();
		}
		return n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		run(n);
	}
}

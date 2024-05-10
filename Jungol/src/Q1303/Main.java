package Q1303;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp1 = sc.nextInt();
		int inp2 = sc.nextInt();

		int num = 1;

		for (int i = 0; i < inp1; i++) {
			for (int j = 0; j < inp2; j++) {
				System.out.print(num++ + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}

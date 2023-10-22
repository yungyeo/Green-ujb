package Q137;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hang = sc.nextInt();
		int yeol = sc.nextInt();
		sc.close();

		for (int i = 1; i <= hang; i++) {
			for (int j = 1; j <= yeol; j++) {
				System.out.print(i * j + " ");
			}
			System.out.println();
		}
	}
}
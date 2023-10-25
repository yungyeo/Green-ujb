package Q9068;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i < 100; i++) {
			int inp = sc.nextInt();

			if (inp == 0) {
				sc.close();
				break;
			} else if (i % 2 == 0) {
				System.out.print(inp + " ");
			}
		}
	}
}
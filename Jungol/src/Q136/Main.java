package Q136;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();

		for (int i = 1; i <= 10; i++) {
			System.out.print(inp * i + " ");
		}
	}
}
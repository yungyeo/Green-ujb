package Q9111;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String reset = "jungol olympiad";

		for (int i = 0; i < 5; i++) {
			int inp = sc.nextInt();
			char num = reset.charAt(inp);

			System.out.print(num);
		}
		sc.close();
	}
}
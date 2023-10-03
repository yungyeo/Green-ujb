package Q540;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (;;) {
			int inp = sc.nextInt();
			if (inp % 3 == 0) {
				System.out.println(inp / 3);
			} else if (inp == -1) {
				break;
			}
		}
		sc.close();
	}
}

package Q9015;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp1 = sc.nextInt();
		int inp2 = sc.nextInt();

		int sum1 = inp1 * inp2;
		int sum2 = inp1 / inp2;

		if (inp1 > inp2) {
			System.out.println(inp1 + " * " + inp2 + " = " + sum1);
			System.out.println(inp1 + " / " + inp2 + " = " + sum2);
		}
		sc.close();
	}
}

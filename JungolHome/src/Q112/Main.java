package Q112;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		int sum1 = a / b;
		int sum2 = a % b;

		System.out.print(a + " / " + b + " = " + sum1 + "..." + sum2);
		System.out.println();
		System.out.print(a + " / " + b + " = " + (a/b) + "..." + (a%b));
	}
}

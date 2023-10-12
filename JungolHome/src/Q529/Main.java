package Q529;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int he = sc.nextInt();
		int we = sc.nextInt();
		sc.close();

		int sum = we + 100 - he;

		System.out.println(sum);

		if (sum > 0) {
			System.out.println("Obesity");
		}
	}
}

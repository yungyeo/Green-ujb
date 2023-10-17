package Q525;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();

		boolean d;
		boolean e;

		if (a > b && a > c) {
			d = true;
		} else {
			d = false;
		}

		if (a == b && b == c && a == c) {
			e = true;
		} else {
			e = false;
		}

		System.out.print(d + " " + e);
	}
}

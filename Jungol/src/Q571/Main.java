package Q571;

import java.util.Scanner;

public class Main {
	// case 1 ------------------------------------------
	void run() {
		System.out.println("~!@#$^&*()_+|");
	}

	// case 2 ----------------------------------------
	/*
	 * static void run() { System.out.println("~!@#$^&*()_+|"); }
	 */

	public static void main(String[] args) {
		// (C언어)함수 → (JAVA)메소드
		// case 1 ----------------------------------------
		Main m = new Main();

		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();

		for (int i = 0; i < inp; i++) {
			// case 1 -----------------------------------
			m.run();

			// case 2 ------------------------------------
			// run();
		}
	}
}

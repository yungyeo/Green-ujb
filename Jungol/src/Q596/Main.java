package Q596;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int inp = sc.nextInt();
		sc.close();

//		System.out.print(str + " ");
//		System.out.print(inp);

		if (str.length() < inp) {
			for (int i = str.length() - 1; i >= 0; i--) {
				System.out.print(str.charAt(i));
			}
		} else {
			for (int i = str.length() - 1, c = 0; c < inp; i--, c++) {
				System.out.print(str.charAt(i));
			}
		}
	}
}

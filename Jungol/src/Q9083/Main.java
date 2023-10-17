package Q9083;

import java.util.Scanner;

public class Main {
	public static int run(int inp) {
		System.out.println("10큰수 : " + (inp + 10));
		System.out.println("10작은수 : " + (inp - 10));
		return inp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();

		run(inp);
	}
}

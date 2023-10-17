package Q519;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp1 = sc.nextInt();
		int inp2 = sc.nextInt();
		sc.close();
		
		System.out.print((inp1 + 100) + " ");
		System.out.println(inp2 % 10);
	}
}

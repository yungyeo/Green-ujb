package Q120;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp1 = sc.nextInt();
		int inp2 = sc.nextInt();
		sc.close();
		
		// case 1. -----------------------
		if(inp1 > inp2) {
			System.out.println(inp1 - inp2);
		}else {
			System.out.println(inp2 - inp1);
		}

		// case 2. -----------------------
		System.out.println(Math.abs(inp1 - inp2));
		
		// case 3. -----------------------
		System.out.println(Math.max(inp1, inp2) - Math.min(inp1, inp2));
	}
}

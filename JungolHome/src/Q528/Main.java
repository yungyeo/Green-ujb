package Q528;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();
		
		if(inp < 0) {
			System.out.println(inp);
			System.out.println("minus");
		} else {
			System.out.println(inp);
		}
	}
}

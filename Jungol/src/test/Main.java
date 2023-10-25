package test;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();
		
		if(inp %400 == 0) {
			System.out.println("leap year");
		}else if(inp %4 == 0 && inp %100 != 0) {
			System.out.println("leap year");
		}else {
			System.out.println("common year");
		}
	}
}

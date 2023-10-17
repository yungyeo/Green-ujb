package Q9018;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 개의 수를 입력하시오. ");
		int inp1 = sc.nextInt();
		int inp2 = sc.nextInt();
		sc.close();
		
		int sum2 = inp1 - inp2;
		int sum3 = inp1 * inp2;
		int sum4 = inp1 / inp2;
		int sum5 = inp1 % inp2;
		
		System.out.println(inp1 + " + " + inp2 + " = " + (inp1+inp2));
		System.out.println(inp1 + " - " + inp2 + " = " + sum2);
		System.out.println(inp1 + " * " + inp2 + " = " + sum3);
		System.out.println(inp1 + " / " + inp2 + " = " + sum4);
		System.out.println(inp1 + " % " + inp2 + " = " + sum5);
	}
}

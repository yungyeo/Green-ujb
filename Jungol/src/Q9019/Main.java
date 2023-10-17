package Q9019;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("5개의 수를 입력하시오. ");
		int inp1 = sc.nextInt();
		int inp2 = sc.nextInt();
		int inp3 = sc.nextInt();
		int inp4 = sc.nextInt();
		int inp5 = sc.nextInt();
		sc.close();
		
		int sum1 = inp1 + 3;
		int sum2 = inp2 - 3;
		int sum3 = inp3 * 3;
		int sum4 = inp4 / 3;
		int sum5 = inp5 % 3;
		
		System.out.print(sum1 + " " + sum2 + " " + sum3 + " " + sum4 + " " + sum5);
	}
}

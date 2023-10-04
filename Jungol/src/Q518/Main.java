package Q518;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp1 = sc.nextInt();
		int inp2 = sc.nextInt();
		int inp3 = sc.nextInt();
		sc.close();
		
		int sum = inp1 + inp2 + inp3;
		int avg = sum /3;
		
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
	}
}

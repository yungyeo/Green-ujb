package Q559;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] dou = {0, 85.6, 79.5, 83.1, 80.0, 78.2, 75.0};
		int inp1 = sc.nextInt();
		int inp2 = sc.nextInt();
		sc.close();
		
		System.out.println(dou[inp1] + dou[inp2]);
		//System.out.println(dou[inp1 -1] + dou[inp2 -1]);
	}
}

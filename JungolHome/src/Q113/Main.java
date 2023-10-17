package Q113;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		System.out.println("width = " + (a+5));
		System.out.println("length = " + (b*2));
		System.out.println("area = " + ((a+5)*(b*2)));
	}
}

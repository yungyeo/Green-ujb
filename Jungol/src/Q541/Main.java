package Q541;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
		for(int i=1;i<=20;i++) {
			System.out.print(str);
		}
	}
}

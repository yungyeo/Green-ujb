package Q597;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String str2 = sc.nextLine();
		sc.close();
		
		int leng = str.length();
		int leng2 = str2.length();
		
		System.out.println(leng + leng2);
	}
}

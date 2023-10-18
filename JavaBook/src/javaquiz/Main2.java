package javaquiz;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main2 {	
	private Scanner sc;
	private String str;
	private StringTokenizer strTo;

	public Main2() {
		sc = new Scanner(System.in);
		str = sc.nextLine();
		strTo = new StringTokenizer(str);
	}

	public void run() {
		while (strTo.hasMoreTokens()) {
			System.out.println("Name : " + strTo.nextToken());
			System.out.println("School : " + strTo.nextToken());
			System.out.println("Grade : " + strTo.nextToken());
		}
	}
	
	public static void main(String[] args) {
		Main2 m = new Main2();
		m.run();
	}
}

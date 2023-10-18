package javaquiz;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
		StringTokenizer strTo = new StringTokenizer(str);
		
		while (strTo.hasMoreTokens()) {
			System.out.println("Name : " + strTo.nextToken());	
			System.out.println("School : " + strTo.nextToken());	
			System.out.println("Grade : " + strTo.nextToken());	
		}
		
	}
}


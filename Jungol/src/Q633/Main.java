package Q633;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. Korea");
			System.out.println("2. USA");
			System.out.println("3. Japan");
			System.out.println("4. China");
			System.out.print("number? ");
			
			String str = sc.nextLine();
			System.out.println();
			
			if(str.equals("1")) {
				System.out.println("Seoul");
			}else if(str.equals("2")) {
				System.out.println("Washington");
			}else if(str.equals("3")) {
				System.out.println("Tokyo");
			}else if(str.equals("4")) {
				System.out.println("Beijing");
			}else {
				System.out.println("none");
				break;
			}
			System.out.println();
		}
		sc.close();
	}
}

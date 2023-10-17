package Q598;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		while(true) {
			char ch = sc.next().charAt(0);
			int inp = (int)ch;
			
			if(ch >= 'A') {
				System.out.println(ch);	
			}else if(ch >= 48 && ch <= 57) {
				System.out.println(inp);
			}else{
				break;

			}
		}
		sc.close();		
		
		/*
		char inp1 = '\0';
		boolean b = true;
		
		do {
			inp1 = sc.next().charAt(0);
			
			if(Character.isAlphabetic(inp1)) {
				System.out.println(inp1);
			}else if(Character.isDigit(inp1)) {
				System.out.printf("%d\n", (int)inp1);
			}else {
				b = false;
			}
		} while(b); {
			sc.close();
		}
		*/
	}
}

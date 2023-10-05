package Q9108;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = 0;
		
		while(true) {
			ch = sc.next().charAt(0);
			int inp = (int)ch;	
			System.out.println(ch + " -> " + inp);
			
			if(ch == 48) {
				break;
			}
		}
	}
}

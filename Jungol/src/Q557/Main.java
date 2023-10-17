package Q557;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = new String[10];
		
		//case1
		for(int i=0;i<str.length;i++) {
			str[i] = sc.next();
			if(i %3 == 0 && i != 9) {
				System.out.print(str[i] + " ");
			}
		}
		
		
		//case2
		/*
		char[] chr = new char[10];
		for(int i = 0; i<chr.length;i++) {
			chr[i] = sc.next().charAt(0);			
		}
		System.out.print(chr[0] + " " + chr[3] + " " + chr[6]);
		*/
		
		sc.close();
	}
}

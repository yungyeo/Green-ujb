package Q600;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
		StringTokenizer strToken = new StringTokenizer(str);
		
		System.out.print(strToken.countTokens());
		
		//case 2---------------------------------------
		/*
		int cnt = 1;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == ' ') {
				cnt++;
			}
		}
		System.out.println(cnt);
		*/
	}
}

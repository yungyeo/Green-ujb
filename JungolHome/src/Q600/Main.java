package Q600;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String mystr = " ";
		String str = sc.nextLine();
		sc.close();
		
		StringTokenizer strToken = new StringTokenizer(str, mystr);
		int tokensCount = strToken.countTokens();
		
		System.out.print(String.valueOf(tokensCount));
	}
}

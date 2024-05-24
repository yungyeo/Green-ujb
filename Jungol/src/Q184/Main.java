package Q184;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.next();
		String reinp = inp.replaceAll("[^0-9A-Za-z]", "");
		sc.close();

		System.out.print(reinp.toLowerCase());
	}
}

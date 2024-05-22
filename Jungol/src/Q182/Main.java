package Q182;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char inp1 = sc.next().charAt(0);
		char inp2 = sc.next().charAt(0);
		sc.close();

		if ((int) inp1 > (int) inp2) {
			System.out.print(((int) inp1 + (int) inp2) + " " + ((int)inp1 - (int)inp2));
		} else {
			System.out.print(((int) inp1 + (int) inp2) + " " + ((int)inp2 - (int)inp1));
		}
	}
}

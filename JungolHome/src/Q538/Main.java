package Q538;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("number? ");
			int inp = sc.nextInt();
			int i = 0;
			if(i<inp) {
				System.out.println("positive integer");
			} else if(i>inp) {
				System.out.println("negative number");
			} else {
				break;
			}
		}
		sc.close();
	}
}

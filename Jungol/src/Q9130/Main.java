package Q9130;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 이름은 무엇입니까? ");
		String str = sc.next();
		System.out.print("당신의 나이는 몇 살입니까? ");
		int inp = sc.nextInt();
		sc.close();
		
		System.out.println("당신의 이름은 " + str + "이고 나이는 " + inp + "세이군요.");
	}
}

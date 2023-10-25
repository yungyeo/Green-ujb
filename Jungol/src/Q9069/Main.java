package Q9069;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (;;) {
			System.out.print("YEAR = ");
			int year = sc.nextInt();
			System.out.print("MONTH = ");
			int month = sc.nextInt();

			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
				System.out.println("입력하신 달의 날 수는 31일입니다.");
			} else if (month == 2) {
				System.out.println("입력하신 달의 날 수는 29일입니다.");
			} else if (month == 4 || month == 6 || month == 9 || month == 11) {
				System.out.println("입력하신 달의 날 수는 30일입니다.");
			} else if (month == 0) {
				sc.close();
				break;
			} else {
				System.out.println("잘못 입력하였습니다.");
			}
			System.out.println();
		}

		
		/*
		while (true) {
			System.out.print("YEAR = ");
			int year = sc.nextInt();
			System.out.print("MONTH = ");
			month = sc.nextInt();

			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("입력하신 달의 날 수는 31일입니다.");
				break;

			case 2:
				System.out.println("입력하신 달의 날 수는 29일입니다.");
				break;

			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("입력하신 달의 날 수는 30일입니다.");
				break;

			case 0:
				break;

			default:
				System.out.println("잘못 입력하였습니다.");
				break;
			}
			if (month == 0) {
				sc.close();
				break;
			}
			System.out.println();
		}
		*/
	}
}

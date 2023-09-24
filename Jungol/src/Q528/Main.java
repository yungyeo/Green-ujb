package Q528;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//case 1
		int inp = scanner.nextInt();
		scanner.close(); //스캐너 사용 후 닫음(경고메시지 종료)
		
		System.out.println(inp);
		if(inp < 0) {
			System.out.println("minus");
		}
		
		//case 2
//		String strX = scanner.nextLine();
//		int x = Integer.parseInt(strX);
		
//		if (x>0) {
//			System.out.println(x);
//		} else {
//			System.out.println(x);
//			System.out.println("minus ");
//		}
		
		
	}

}

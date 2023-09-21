package Q594;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();	//문자열을 선언받을 땐 next(문자열 한개) 혹은 nextLine을 사용해야한다.
		sc.close();
		
		//case 1
		for (int i=0; i<2; i++) {
			System.out.println(str);
		}
		
		//case 2
		if(str.length()>100) {
			System.out.println("문자열이 100자 이상입니다.");
		}else {
			System.out.println(str + str);
		}
		

		
	}

}

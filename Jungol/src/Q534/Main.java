package Q534;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();				//case1 , 3
//		char str = sc.next().charAt(0);		//case2
		sc.close();
		
		//case1
		/*
		switch(str) {
		case "A" :
			System.out.println("Excellent");
			break;
		case "B" :
			System.out.println("Good");
			break;
		case "C" :
			System.out.println("Usually");
			break;
		case "D" :
			System.out.println("Effort");
			break;
		case "F" :
			System.out.println("Failure");
			break;
		default :
			System.out.println("Error");
		}
		*/
		
		System.out.println();
		
		//case2
		/*
		if(str == 'A') {
			System.out.println("Excellent");
		} else if(str == 'B') {
			System.out.println("Good");
		} else if(str == 'C') {
			System.out.println("Usually");
		} else if(str == 'D') {
			System.out.println("Effort");
		} else if(str == 'F') {
			System.out.println("Failure");
		} else {
			System.out.println("Error");
		}
		*/
		
		System.out.println();
		
		
		//case3
		if(str.equals("A")) {	//if문은 숫자와 문자만 산출되어 문자열을 산출하기 위해선 equals 매소드를 사용해 주어야한다.
			System.out.println("Excellent");
		} else if(str.equals("B")) {
			System.out.println("Good");
		} else if(str.equals("C")) {
			System.out.println("Usually");
		} else if(str.equals("D")) {
			System.out.println("Effort");
		} else if(str.equals("F")) {
			System.out.println("Failure");
		} else {
			System.out.println("Error");
		}
	}

}

package Q535;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double score = sc.nextDouble();
		
		
		//case1
		/*
		if(score < 2) {
			System.out.print("retake");
		}else if(score >= 2 && score < 3) {
			System.out.print("seasonal semester");
		}else if(score >= 3 && score < 4) {
			System.out.print("next semester");
		}else if(score >= 4 && score <= 4.5) {
			System.out.print("scholarship");
		}
		*/
		
		//case2
		/*
		if(score >= 4) {
			System.out.print("scholarship");
		}else if(score >= 3) {
			System.out.print("next semester");
		}else if(score > 2) {
			System.out.print("seasonal semester");
		}else {
			System.out.print("retake");
		}
		*/
		
		
		//case3
		
		switch((int)score) {
		case 2 :
			System.out.print("seasonal semester");
			break;
		case 3 :
			System.out.print("next semester");
			break;
		case 4 :
			System.out.print("scholarship");
			break;
		default :
//		case 1:
//		case 0:
			System.out.print("retake");
		}
		
		sc.close();
		
	}

}

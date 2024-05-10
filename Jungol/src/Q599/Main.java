package Q599;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ABC = sc.nextLine();
		sc.close();

		System.out.println(ABC.replaceAll("[^A-z]", "").toUpperCase());
		
		//case 1(C언어 스타일) ------------------
		/*
		for(int i =0;i<ABC.length();i++) {
			char c = ABC.charAt(i);
			if('A' <= c && c <= 'Z') {
				System.out.print((char)c);
			}else if('a' <= c && c <= 'z') {
				System.out.print((char)(c - 32));
			}
		}
		*/
		
		//case 2(자바 스타일) ------------------
		/*
		for(int i =0;i<ABC.length();i++) {
			char c = ABC.charAt(i);
			
			if(Character.isAlphabetic(c)) {
				System.out.print(Character.toUpperCase(c));
			}
		}
		*/
	}
}

package Q9116;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
		sc.close();
		
		// 문자열을 공백 기준으로 분리
        String[] words = inp.split(" ");

        // 각 단어를 줄바꿈하여 출력
        for (String word : words) {
            System.out.println(word);
        }
        
//		split 안에 inp를 넣어 오류 발생되었음. 어떠한 기준으로 자를건지에 대한 내용으로 삽입해야함.
//      String[] words = inp.split(inp);
	}
}

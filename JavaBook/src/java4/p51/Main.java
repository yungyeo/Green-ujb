package java4.p51;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) {
		int[] scores = { 99, 68, 36, 29, 88};
		
		Arrays.sort(scores);
		for(int i = 0; i< scores.length; i++) {
			System.out.println("scores[" + i + "]" + scores[i]);
		}
		
		System.out.println();
		
		String[] names = { "홍길동", "박동수", "김민수" };
		Arrays.sort(names);
		for(int i=0; i<names.length; i++) {
			System.out.println("names[" + i + "]" + names[i]);
		}
	}
}

package java4.p43;

import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		String text = "홍길동/이수홍/박연수";
		
		StringTokenizer st = new StringTokenizer(text, "/");
		int countTokens = st.countTokens();
		for(int i=0; i<countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println();
		
		st = new StringTokenizer(text, "/");
		while(st.hasMoreTokens()) {		//주로 Token은 while문으로 더 사용을 많이 함.
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}

package Q9008;

public class Main {
	public static void main(String[] args) {
		String[] str = {"korean", "english", "computer"};
		int[] inp = {90, 100, 80};
		
		System.out.println(" subject score");
		for(int i=0;i<14;i++) {
				System.out.print("=");
		}
		System.out.println();
		
		for(int j = 0; j<str.length; j++) {
		System.out.printf("%8s%6d\n", str[j], inp[j]);
		}
	}
}
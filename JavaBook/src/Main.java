
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	private Scanner sc;
	private String str;
	private StringTokenizer strTo;

	public Main() {
		sc = new Scanner(System.in);
		str = sc.nextLine();
		strTo = new StringTokenizer(str);
	}

	public void run() {
		while (strTo.hasMoreTokens()) {
			System.out.println("Name : " + strTo.nextToken());
			System.out.println("School : " + strTo.nextToken());
			System.out.println("Grade : " + strTo.nextToken());
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}

package Q9081;

public class Main {
	static void run() {
		System.out.print("=");
		return;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 30; i++) {
			run();
		}
		System.out.println();
		System.out.println("line 함수를 호출하였습니다.");
		System.out.println("line 함수를 다시 호출합니다.");

		for (int i = 0; i < 30; i++) {
			run();
		}
	}
}

package Q9040;

public class Main {
	public static void main(String[] args) {
		int num = 1;
		int sum = 0;

		while (num <= 10) {
			sum += num;
			num++;
		}
		System.out.println("1부터 10까지의 합 = " + sum);
		System.out.println("while문이 끝난 후의 num의 값 = " + num);
	}
}

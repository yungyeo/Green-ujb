package Q9054;

public class Main {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=2;i<=4;i++) {
			for(int j=1;j<=9;j++) {
				sum = i*j;
				System.out.println(i + " * " + j + " = " + sum);
			}
			System.out.println();
		}	
	}
}
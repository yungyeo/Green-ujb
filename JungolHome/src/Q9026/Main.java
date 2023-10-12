package Q9026;

public class Main {
	public static void main(String[] args) {
		int a = 0, b = 1, c = 2;
		
		if(a<b || b>c) {
			System.out.print("1 ");
		}else {
			System.out.print("0 ");
		}
		
		if(a>=b || b<=c) {
			System.out.print("1 ");
		}else {
			System.out.print("0 ");
		}
		
		if(a>=b && b>=c) {
			System.out.print("1 ");
		}else {
			System.out.print("0 ");
		}
		
		if(a!=b || b==c) {
			System.out.print("1 ");
		}else {
			System.out.print("0 ");
		}
	}
}

package Q595;

public class Main {
	public static void main(String[] args) {
		String sub = "Hong Gil Dong";
		
		//case 1
		String num = sub.substring(3,7);
		System.out.println(num);
		
		//case 2
		/* System.out.print(sub.charAt(3));
		System.out.print(sub.charAt(4));
		System.out.print(sub.charAt(5));
		System.out.print(sub.charAt(6)); */
		
		//case 3
		for(int i=3; i <= 6; i++) {
			System.out.print(sub.charAt(i));
		}
		
	}

}

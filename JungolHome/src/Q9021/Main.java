package Q9021;

public class Main {
	public static void main(String[] args) {
		int a = 10, b = 10;
		System.out.println("최초값 a = " + a + ", b = " + b);
		
		System.out.println();
		
		a++; ++b;
		System.out.println("a++ = 10, ++b = 11");
		System.out.println("실행후 a = " + a + ", b = " + b);
		
		System.out.println();
		
		a--; --b;
		System.out.println("a-- = 11, --b = 10");
		System.out.println("실행후 a = " + a + ", b = " + b);
	}
}

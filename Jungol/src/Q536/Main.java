package Q536;

public class Main {

	public static void main(String[] args) {
		
		//case 1
		/*
		int a = 1;
		while (a<=15) {
			System.out.print(a + " ");
			a++;
		}
		*/
		
		//case 2
		/*
		for(int a=1; a<=15; a++) {
			System.out.print(a + " ");
		}
		*/
		
		//case 3
		int a = 1;
		do {
			System.out.print(a++ + " ");
		} while(a <= 15);
	}

}

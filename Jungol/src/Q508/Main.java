package Q508;

public class Main {
	public static void main(String[] args) {
		/*
		//case1
		String a = "item";
		String b = "count";
		String c = "price";
		System.out.printf("%10s%10s%10s\n" , a, b, c);
		
		String d = "pen";
		int p = 20;
		int u = 100;
		System.out.printf("%10s%10d%10d\n" , d, p, u);
		
		String e = "note";
		int q = 5;
		int w = 95;
		System.out.printf("%10s%10d%10d\n" , e, q, w);
		
		String t = "eraser";
		int y = 110;
		int o = 97;
		System.out.printf("%10s%10d%10d\n" , t, y, o);
		
		System.out.println();
		
		//case2
		System.out.println("      item     count     price");
		System.out.println("       pen        20       100");
		System.out.println("      note         5        95");
		System.out.println("    eraser       110        97");
		*/
		
		
		//case3
		String[] ar = {"item" , "count" , "price" , 
						"pen" , "20" , "100",
						"note" , "5" , "95",
						"eraser" , "110" , "97"};
		
		for(int i = 0; i<ar.length; i++) {
			if(i % 3 == 0 && i !=0) {
//				System.out.println();
				System.out.print("\n");
			}
			System.out.printf("%10s", ar[i]);
		}
	}
}

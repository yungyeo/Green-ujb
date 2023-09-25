package Q104;

public class Main {
	public static void main(String[] args) {
		//case 1
		int[] inp = {90, 80, 100};
		int sum = 0;
		
		for(int i=0; i < inp.length; i++) {
		sum += inp[i];
		}
		
		System.out.println("kor" + " " + inp[0]);
		System.out.println("mat" + " " + inp[1]);
		System.out.println("eng" + " " + inp[2]);
		System.out.println("sum" + " " + sum);
		
		
		System.out.println("---------------------------------");
		
		//case 2
		int kor = 90;
		int mat = 80;
		int eng = 100;
		int sum2 = 0;
		
		sum2 += kor+mat+eng;
		
		System.out.println("kor" + " " + kor);
		System.out.println("mat" + " " + mat);
		System.out.println("eng" + " " + eng);
		System.out.println("sum" + " " + sum2);		
	}
}

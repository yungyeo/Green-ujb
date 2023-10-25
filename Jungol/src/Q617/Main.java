package Q617;

import java.util.Scanner;

class NHMain {
	private NamesHeight[] nh;
	private int min;

	public NHMain(String name1, int height1, String name2, int height2, String name3, int height3, String name4,
			int height4, String name5, int height5) {
		nh = new NamesHeight[5];

		nh[0] = new NamesHeight(name1, height1);
		nh[1] = new NamesHeight(name2, height2);
		nh[2] = new NamesHeight(name3, height3);
		nh[3] = new NamesHeight(name4, height4);
		nh[4] = new NamesHeight(name5, height5);
		min = 1000;
	}

	public void getRun() {
		for (int i = 1 - 1; i < nh.length; i++) {
			if (min > nh[i].getHeight()) {
				min = nh[i].getHeight();
			}
		}

		for (int i = 0; i < nh.length; i++) {
			if (min >= nh[i].getHeight())
				System.out.println(nh[i].getName() + " " + min);
		}
	}
}

class NamesHeight {
	private String name;
	private int height;

	public NamesHeight(String name, int height) {
		this.name = name;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public int getHeight() {
		return height;
	}
	/*
	public void print() {
		System.out.println(name + " " + height);
	}
	*/
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name1 = sc.next();
		int height1 = sc.nextInt();
		String name2 = sc.next();
		int height2 = sc.nextInt();
		String name3 = sc.next();
		int height3 = sc.nextInt();
		String name4 = sc.next();
		int height4 = sc.nextInt();
		String name5 = sc.next();
		int height5 = sc.nextInt();
		sc.close();

		NHMain nhm = new NHMain(name1, height1, name2, height2, name3, height3, name4, height4, name5, height5);
		nhm.getRun();
		
		/*
		NamesHeight[] nh = new NamesHeight[5];
		for(int i = 0; i<nh.length;i++) {
			String name = sc.next();
			int height = sc.nextInt();
			nh[i] = new NamesHeight(name, height);
		}
		
		for(int i=0; i<nh.length;i++) {
			nh[i].print();
		}
		
		Person min = new Person("", 1000);
		for(int i =0; i<nh.length;i++{
			if(min.getHeight() > nh[i].getHeight){
				min = nh[i];
			}
		}
		min.print();
		*/
	}
}
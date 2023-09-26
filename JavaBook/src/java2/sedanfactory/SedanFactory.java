package java2.sedanfactory;

import java2.conponent.Tire2;

public class SedanFactory {
	public static void main(String[] args) {
		Tire2 compoTire = new Tire2();
		compoTire.setSize(20);
		
		System.out.println(compoTire.getSize());
	}

}

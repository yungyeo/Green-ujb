package java2.sedanfactory;

import java2.conponent.Tire;

public class Sedan {
	public static void main(String[] args) {
//		java2.conponent.Tire compoTire = new java2.conponent.Tire();
		Tire compoTire = new Tire();
//		compoTire.size = 20;
		compoTire.setSize(20);
		
//		System.out.println(compoTire.size);
		System.out.println(compoTire.getSize());
		System.out.println(compoTire.getBigSize());
//		System.out.println(compoTire.setDoubleSize());
	}

}

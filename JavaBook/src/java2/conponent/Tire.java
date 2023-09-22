package java2.conponent;

public class Tire {
	private int size;


	public int getSize() {
		return size;
	}
	
	public void setSize(int psize) {
		size = psize;
	}
	
	//case1
	private int bigsize;
	
	public int getBigSize() {
		return size * 2;
	}
	
	public void setBigSize(int pbigsize) {
		bigsize = pbigsize;
	}
	
	//case2
	public void setDoubleSize() {
		size = size *2;
	}
	
	
	
}

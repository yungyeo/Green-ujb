package java5.p61;

public class SJStack {
	private int[] coinBox;
	private int top;
	
	public SJStack() {
		coinBox = new int[10];
		top = -1;
	}

	public void push(Coin coin) {
		coinBox[++top] = coin.getValue();
	}

	public boolean isEmpty() {
		if(top == -1) {
			return true;
		}else {
			return false;
		}
	}

	public Coin pop() {
		Coin coin = new Coin(coinBox[top--]);
		return coin;
	}

}

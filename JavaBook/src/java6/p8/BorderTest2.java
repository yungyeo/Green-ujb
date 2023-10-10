package java6.p8;

import java.awt.*;

public class BorderTest2 {
	private Frame frame;
	private Button center, west;
	private TextField tf1;

	public BorderTest2() {
		frame = new Frame("BorderLayout example");
//		south = new Button("button 1");
		west = new Button("button 2");
//		east = new Button("button 3");
		center = new Button("button 4");
		tf1 = new TextField();
		tf1.setText("입력창 입니다.");
	}

	public void startFrame() {
		frame.add(tf1, "North");
//		frame.add(south, "South");
		frame.add(west, "West");
//		frame.add(east, "East");
		frame.add(center, "Center");

		frame.setSize(400, 400);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		BorderTest2 border = new BorderTest2();
		border.startFrame();
	}
}

package java6.p47;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.ScrollPane;

public class CanvasTest {
	public static void main(String[] args) {
		Frame f = new Frame("Canvas Test");
		f.setSize(300, 200);
		
		ScrollPane sp = new ScrollPane();
		Panel p = new Panel();
		p.setBackground(Color.pink);
		p.add(new Button("1st"));
		p.add(new Button("2st"));
		p.add(new Button("3st"));
		p.add(new Button("4st"));
		
		sp.add(p);
		f.add(sp);
		f.setVisible(true);
	}
}

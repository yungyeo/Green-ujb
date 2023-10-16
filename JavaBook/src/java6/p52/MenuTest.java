package java6.p52;

import java.awt.*;
import java.awt.event.*;

/*
import java.awt.Button;
import java.awt.CheckboxMenuItem;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
*/

public class MenuTest extends WindowAdapter {
	private Frame f;

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public MenuTest() {
		f = new Frame("Parent");
		f.setSize(400, 300);

		TextArea comments = new TextArea(10, 50);

		MenuBar mb = new MenuBar();
		Menu mFile = new Menu("File");
		MenuItem miNew = new MenuItem("New");
		MenuItem miNewWindow = new MenuItem("New Window");
		MenuItem miOpen = new MenuItem("Open");
		MenuItem miSave = new MenuItem("Save");
		MenuItem miOtherSave = new MenuItem("Other Save");
		Menu mOthers = new Menu("Others");
		MenuItem miExit = new MenuItem("Exit");

		mFile.add(miNew);
		mFile.add(miNewWindow);
		mFile.add(miOpen);
		mFile.add(miSave);
		mFile.add(miOtherSave);
		mFile.addSeparator();
		mFile.add(mOthers);
		mFile.addSeparator();
		mFile.add(miExit);

		miExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		MenuItem miPrint = new MenuItem("Print...");
		MenuItem miPreview = new MenuItem("Print Preview");
		MenuItem miSetup = new MenuItem("Print Setup...");
		mOthers.add(miPrint);
		mOthers.add(miPreview);
		mOthers.add(miSetup);

		Menu mEdit = new Menu("Edit");
		MenuItem miUndo = new MenuItem("Undo");
		MenuItem miSnipping = new MenuItem("Snipping");
		MenuItem miCopy = new MenuItem("Copy");
		MenuItem miPastable = new MenuItem("Pastable");
		MenuItem miDelete = new MenuItem("Delete");
		MenuItem miFind = new MenuItem("Find");
		MenuItem miChange = new MenuItem("Change");
		MenuItem miSelestAll = new MenuItem("Select All");
		MenuItem miDate = new MenuItem("Date");

		mEdit.add(miUndo);
		mEdit.add(miSnipping);
		mEdit.add(miCopy);
		mEdit.add(miPastable);
		mEdit.add(miDelete);
		mEdit.addSeparator();
		mEdit.add(miFind);
		mEdit.add(miChange);
		mEdit.addSeparator();
		mEdit.add(miSelestAll);
		mEdit.add(miDate);

		Menu mView = new Menu("View");
		CheckboxMenuItem miStatusbar = new CheckboxMenuItem("Statusbar");
		Menu mOthers2 = new Menu("Others");
		MenuItem miExpansion = new MenuItem("Expansion");
		MenuItem miScale = new MenuItem("Scale Down");
		MenuItem miRestoration = new MenuItem("Restoration");

		mView.add(miStatusbar);
		mView.addSeparator();
		mView.add(mOthers2);

		mOthers2.add(miExpansion);
		mOthers2.add(miScale);
		mOthers2.add(miRestoration);

		Menu mHelp = new Menu("Help");
		MenuItem miHelpSee = new MenuItem("Help See");
		MenuItem miFeedback = new MenuItem("FeedBack Send");
		MenuItem miInformation = new MenuItem("Information");

		mHelp.add(miHelpSee);
		mHelp.add(miFeedback);
		mHelp.addSeparator();
		mHelp.add(miInformation);

		Dialog info = new Dialog(f, "Information", true);
		info.setSize(150, 100);
		info.setLocation(60, 60);
		info.setLayout(new FlowLayout());

		Label msg = new Label("This is Memo Dialog", Label.CENTER);
		Button ok = new Button("OK");
		info.add(msg);
		info.add(ok);

		miInformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				info.setVisible(true);
			}
		});

		ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				info.dispose();
			}
		});

		mb.add(mFile);
		mb.add(mEdit);
		mb.add(mView);
		mb.setHelpMenu(mHelp);

		f.addWindowListener(this);

		f.setMenuBar(mb);
		f.add(comments);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		MenuTest mt = new MenuTest();
	}
}

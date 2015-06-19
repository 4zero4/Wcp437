package rltut;

import java.awt.Rectangle;

import javax.swing.JFrame;

import asciiPanel.AsciiPanel;

public class ApplicationMain extends JFrame {
	private static final long serialVersionUID = 1060623638149583738L;

	private AsciiPanel terminal;

	public ApplicationMain() {
		super();
		terminal = new AsciiPanel();
		terminal.write("ASCII ART FUNCIONANDO!", 1, 1);
		add(terminal);
		pack();
	}

	public static void main(String[] args) {
		ApplicationMain app = new ApplicationMain();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
		Rectangle r = new Rectangle();
		r.setBounds(3, 3, 15, 20);

		for (int i = 0; i < 10; i++) {
			app.terminal.write("Ola", AsciiPanel.red);
			app.terminal.setCursorY(app.terminal.getCursorY() + 1);
			wasteTime(200);
			app.repaint();
		}
	}

	private static void wasteTime(int milis) {
		try {
			Thread.sleep(milis); // 1000 milliseconds is one second.
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
}
package rltut;

import javax.swing.JFrame;

import asciiPanel.AsciiPanel;

public class ApplicationMain extends JFrame {
	private static final long serialVersionUID = 1060623638149583738L;

	static String lines[] = {
			" $$$$$$\\  $$\\        $$$$$$\\        $$\\      $$\\ $$\\   $$\\ $$\\   $$\\ $$$$$$$\\   $$$$$$\\  ",
			"$$  __$$\\ $$ |      $$  __$$\\       $$$\\    $$$ |$$ |  $$ |$$$\\  $$ |$$  __$$\\ $$  __$$\\ ",
			"$$ /  $$ |$$ |      $$ /  $$ |      $$$$\\  $$$$ |$$ |  $$ |$$$$\\ $$ |$$ |  $$ |$$ /  $$ |",
			"$$ |  $$ |$$ |      $$$$$$$$ |      $$\\$$\\$$ $$ |$$ |  $$ |$$ $$\\$$ |$$ |  $$ |$$ |  $$ |",
			"$$ |  $$ |$$ |      $$  __$$ |      $$ \\$$$  $$ |$$ |  $$ |$$ \\$$$$ |$$ |  $$ |$$ |  $$ |",
			"$$ |  $$ |$$ |      $$ |  $$ |      $$ |\\$  /$$ |$$ |  $$ |$$ |\\$$$ |$$ |  $$ |$$ |  $$ |",
			" $$$$$$  |$$$$$$$$\\ $$ |  $$ |      $$ | \\_/ $$ |\\$$$$$$  |$$ | \\$$ |$$$$$$$  | $$$$$$  |",
			" \\______/ \\________|\\__|  \\__|      \\__|     \\__| \\______/ \\__|  \\__|\\_______/  \\______/ ",};

	private AsciiPanel terminal;

	public ApplicationMain() {
		super();
		terminal = new AsciiPanel(100,20);
		add(terminal);
		pack();
	}

	public static void main(String[] args) {
		ApplicationMain app = new ApplicationMain();
		app.setResizable(false);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
		app.terminal.setCursorPosition(5, 2);
		for (String line : lines) {
			app.terminal.write(line);
			app.terminal.setCursorPosition(5, app.terminal.getCursorY()+1);
			app.repaint();
			wasteTime(100);
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
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BEEPMessages implements ActionListener {
	JFrame f = new JFrame("BEEP! Messages");
	JButton alphanumeric = new JButton("Code/Decode text file");
	JButton morse = new JButton("Morse Code Transmitter");
	JPanel p = new JPanel();

	public static void main(String[] args) {
		int response = JOptionPane.showConfirmDialog(null, "Is it your first time?", "Welcome!",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if (response == JOptionPane.NO_OPTION) {
			BEEPMessages bm = new BEEPMessages();
			bm.setuphome();
		} else if (response == JOptionPane.YES_OPTION) {
			Desktop desktop = Desktop.getDesktop();
			try {
				desktop.browse(new URL("http://apps.samuelsharp.com/Resources/BEEP_Messages/TOS.html").toURI());
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (URISyntaxException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			int response2 = JOptionPane.showConfirmDialog(null, "Do you accept the terms?", "TOS",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if (response2 == JOptionPane.YES_OPTION) {
				BEEPMessages bm = new BEEPMessages();
				bm.setuphome();
			} else if (response2 == JOptionPane.NO_OPTION || response2 == JOptionPane.CLOSED_OPTION) {
				System.exit(0);
			}

		} else if (response == JOptionPane.CLOSED_OPTION) {
			System.exit(0);
		}
	}

	void setuphome() {
		p.add(alphanumeric);
		p.add(morse);
		f.add(p);
		f.setVisible(true);
		f.pack();
		alphanumeric.addActionListener(this);
		morse.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton codesel = (JButton) e.getSource();
		if (codesel == alphanumeric) {
			alphanumeric an = new alphanumeric();
			an.setup();
		} else {
			morse m = new morse();
			m.setup();
		}

	}

}

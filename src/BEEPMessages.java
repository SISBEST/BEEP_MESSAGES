import java.awt.Color;
import java.awt.Container;
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
	JButton alphanumeric = new JButton("Code/Decode with alphanumeric");
	JButton morse = new JButton("Morse Code Transmitter");
	JButton bacon = new JButton("Code/Decode with Baconian Alphabet");
	JButton help = new JButton("HELP ME!!!!!");
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
		p.add(help);
		p.add(bacon);
		f.add(p);
		Container c = f.getContentPane();
		c.setBackground(Color.CYAN);
		f.setVisible(true);
		f.pack();
		alphanumeric.addActionListener(this);
		morse.addActionListener(this);
		help.addActionListener(this);
		bacon.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton codesel = (JButton) e.getSource();
		if (codesel == alphanumeric) {
			alphanumeric an = new alphanumeric();
			an.setup();
		}
		if (codesel == bacon) {
			bacon b = new bacon();
			b.setup();
		}
		if (codesel == help) {
			Desktop desktop = Desktop.getDesktop();
			try {
				desktop.browse(new URL("https://appshelp.samuelsharp.com/beepm/").toURI());
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
		} else {
			morse m = new morse();
			m.setup();
		}

	}

}

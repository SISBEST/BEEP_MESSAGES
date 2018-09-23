import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class BEEPMessages implements ActionListener {
	JFrame f = new JFrame("BEEP! Messages");
	JButton alphanumeric = new JButton("Code/Decode text file");
	JButton morse = new JButton("Morse Code Transmitter");
	JPanel p = new JPanel();
	public static void main(String[] args) {
	BEEPMessages bm = new BEEPMessages();
	bm.setuphome();
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
		if(codesel == alphanumeric) {
			
		}
		else {
			morse m = new morse();
			m.setup();
		}
		
	}

}

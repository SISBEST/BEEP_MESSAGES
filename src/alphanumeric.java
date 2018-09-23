import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class alphanumeric implements ActionListener {
JPanel p = new JPanel();
JFrame f = new JFrame("Encode/Decode");
JButton en = new JButton("Encode a message");
JButton dc = new JButton("Decode a message");
void setup() {
	en.addActionListener(this);
	dc.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	JButton bp = (JButton) e.getSource();
	if(bp == en) {
		
	}
	
}
}

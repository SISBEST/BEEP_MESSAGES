import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;
import javax.swing.*;

public class alphanumeric implements ActionListener {
JPanel p = new JPanel();
JFrame f = new JFrame("Encode/Decode");
JButton en = new JButton("Encode a message");
JButton dc = new JButton("Decode a message");
void setup() {
	en.addActionListener(this);
	dc.addActionListener(this);
	p.add(en);
	p.add(dc);
	f.add(p);
	f.setVisible(true);
}
@Override
public void actionPerformed(ActionEvent e) {
	JButton bp = (JButton) e.getSource();
	if(bp == en) {
	   PrintWriter out;
	try {
		out = new PrintWriter(new File("output.txt"));
		String mes = JOptionPane.showInputDialog("Enter a message to be coded! LETTERS ONLY: NOT CASE SENSITIVE!");
		String coded = encode(mes);
		out.println(coded);
		out.close();
	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	}
	else{
		JFileChooser jfc = new JFileChooser();
		jfc.showOpenDialog(null);
		Scanner in;
		try {
			in = new Scanner(jfc.getSelectedFile());
			while(in.hasNextLine()) {
				String a = in.nextLine();
				JOptionPane.showMessageDialog(null, "Recieved input: " + a + ". Conversion is coming in a later update. In the meantime check out the convertion chart.");
				Desktop desktop=Desktop.getDesktop();
				try {
					desktop.browse(new URL("http://apps.samuelsharp.com/Resources/BEEP_Messages/cipher.html").toURI());
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
				
				
			}} catch (FileNotFoundException e1) {
			System.err.println("There's been an error reading the file...");
			}
		}
	
	}
	String encode(String input) {
		char [] inputchars = input.toCharArray();
		String code = "";
		for(int i = 0; i<inputchars.length; i++) {
			if(inputchars [i]=='a'||inputchars [i]=='A') {
				code = code + "1";
			}
			if(inputchars [i]=='b'||inputchars [i]=='B') {
				code = code + "2";
			}
			if(inputchars [i]=='c'||inputchars [i]=='C') {
				code = code + "3";
			}
			if(inputchars [i]=='d'||inputchars [i]=='D') {
				code = code + "4";
			}
			if(inputchars [i]=='e'||inputchars [i]=='E') {
				code = code + "5";
			}
			if(inputchars [i]=='f'||inputchars [i]=='F') {
				code = code + "6";
			}
			if(inputchars [i]=='g'||inputchars [i]=='G') {
				code = code + "7";
			}
			if(inputchars [i]=='h'||inputchars [i]=='H') {
				code = code + "8";
			}
			if(inputchars [i]=='i'||inputchars [i]=='I') {
				code = code + "9";
			}
			if(inputchars [i]=='j'||inputchars [i]=='J') {
				code = code + "10";
			}
			if(inputchars [i]=='k'||inputchars [i]=='K') {
				code = code + "11";
			}
			if(inputchars [i]=='l'||inputchars [i]=='L') {
				code = code + "12";
			}
			if(inputchars [i]=='m'||inputchars [i]=='M') {
				code = code + "13";
			}
			if(inputchars [i]=='n'||inputchars [i]=='N') {
				code = code + "14";
			}
			if(inputchars [i]=='o'||inputchars [i]=='O') {
				code = code + "15";
			}
			if(inputchars [i]=='p'||inputchars [i]=='P') {
				code = code + "16";
			}
			if(inputchars [i]=='q'||inputchars [i]=='Q') {
				code = code + "17";
			}
			if(inputchars [i]=='r'||inputchars [i]=='R') {
				code = code + "18";
			}
			if(inputchars [i]=='s'||inputchars [i]=='S') {
				code = code + "19";
			}
			if(inputchars [i]=='t'||inputchars [i]=='T') {
				code = code + "20";
			}
			if(inputchars [i]=='u'||inputchars [i]=='U') {
				code = code + "21";
			}
			if(inputchars [i]=='v'||inputchars [i]=='V') {
				code = code + "22";
			}
			if(inputchars [i]=='w'||inputchars [i]=='W') {
				code = code + "23";
			}
			if(inputchars [i]=='x'||inputchars [i]=='X') {
				code = code + "24";
			}
			if(inputchars [i]=='y'||inputchars [i]=='Y') {
				code = code + "25";
			}
			if(inputchars [i]=='z'||inputchars [i]=='Z') {
				code = code + "26";
			}
			if(inputchars [i]=='!') {
				code = code + "26";
			}
			if(inputchars [i]==':') {
				code = code + "26";
			}
			if(inputchars [i]=='/') {
				code = code + "26";
			}
		}
		return code;
	}
}
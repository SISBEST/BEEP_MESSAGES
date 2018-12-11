import java.awt.Color;
import java.awt.Container;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class alphanumeric implements ActionListener {
	JPanel p = new JPanel();
	JFrame f = new JFrame("Encode/Decode: Alphanumeric");
	JButton en = new JButton("Encode a message");
	JButton dc = new JButton("Decode a message");
	int errct = 0;

	void setup() {
		en.addActionListener(this);
		dc.addActionListener(this);
		p.add(en);
		p.add(dc);
		f.add(p);
		Container c = f.getContentPane();
		c.setBackground(Color.GREEN);
		f.setVisible(true);
		f.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton bp = (JButton) e.getSource();
		if (bp == en) {
			PrintWriter out;
			try {
				File cdfl = new File("code.beepm");
				out = new PrintWriter(cdfl);

				String mes = JOptionPane.showInputDialog(
						"Enter a message to be coded! LETTERS ONLY: NOT CASE SENSITIVE! Spaces can be entered but do not display.");
				String fp = "Your code file saved at " + cdfl.getAbsolutePath() + ".";
				JOptionPane.showMessageDialog(null, fp);
				String coded = encode(mes);
				out.println(coded);
				out.close();
				Desktop desktop = Desktop.getDesktop();
				try {
					desktop.browse(new URL("https://beepm.bubbleapps.io/").toURI());
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

			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} else {
			JFileChooser jfc = new JFileChooser();
			jfc.showOpenDialog(null);
			Scanner in;
			try {
				PrintWriter out = new PrintWriter(new File("decoded.beepm"));
				in = new Scanner(jfc.getSelectedFile());
				while (in.hasNextLine()) {
					String a = in.nextLine();
					JOptionPane.showMessageDialog(null, "Recieved input: " + a + " Converting now.");
					String op = decode(a);
					out.println(op);
				}
				out.close();
			} catch (FileNotFoundException e1) {
				System.err.println("There's been an error reading the file...");
			}
		}

	}

	String encode(String input) {
		char[] inputchars = input.toCharArray();
		String code = "";
		for (int i = 0; i < inputchars.length; i++) {
			if (inputchars[i] == 'a' || inputchars[i] == 'A') {
				code = code + "1 ";
			}
			if (inputchars[i] == 'b' || inputchars[i] == 'B') {
				code = code + "2 ";
			}
			if (inputchars[i] == 'c' || inputchars[i] == 'C') {
				code = code + "3 ";
			}
			if (inputchars[i] == 'd' || inputchars[i] == 'D') {
				code = code + "4 ";
			}
			if (inputchars[i] == 'e' || inputchars[i] == 'E') {
				code = code + "5 ";
			}
			if (inputchars[i] == 'f' || inputchars[i] == 'F') {
				code = code + "6 ";
			}
			if (inputchars[i] == 'g' || inputchars[i] == 'G') {
				code = code + "7 ";
			}
			if (inputchars[i] == 'h' || inputchars[i] == 'H') {
				code = code + "8 ";
			}
			if (inputchars[i] == 'i' || inputchars[i] == 'I') {
				code = code + "9 ";
			}
			if (inputchars[i] == 'j' || inputchars[i] == 'J') {
				code = code + "10 ";
			}
			if (inputchars[i] == 'k' || inputchars[i] == 'K') {
				code = code + "11 ";
			}
			if (inputchars[i] == 'l' || inputchars[i] == 'L') {
				code = code + "12 ";
			}
			if (inputchars[i] == 'm' || inputchars[i] == 'M') {
				code = code + "13 ";
			}
			if (inputchars[i] == 'n' || inputchars[i] == 'N') {
				code = code + "14 ";
			}
			if (inputchars[i] == 'o' || inputchars[i] == 'O') {
				code = code + "15 ";
			}
			if (inputchars[i] == 'p' || inputchars[i] == 'P') {
				code = code + "16 ";
			}
			if (inputchars[i] == 'q' || inputchars[i] == 'Q') {
				code = code + "17 ";
			}
			if (inputchars[i] == 'r' || inputchars[i] == 'R') {
				code = code + "18 ";
			}
			if (inputchars[i] == 's' || inputchars[i] == 'S') {
				code = code + "19 ";
			}
			if (inputchars[i] == 't' || inputchars[i] == 'T') {
				code = code + "20 ";
			}
			if (inputchars[i] == 'u' || inputchars[i] == 'U') {
				code = code + "21 ";
			}
			if (inputchars[i] == 'v' || inputchars[i] == 'V') {
				code = code + "22 ";
			}
			if (inputchars[i] == 'w' || inputchars[i] == 'W') {
				code = code + "23 ";
			}
			if (inputchars[i] == 'x' || inputchars[i] == 'X') {
				code = code + "24 ";
			}
			if (inputchars[i] == 'y' || inputchars[i] == 'Y') {
				code = code + "25 ";
			}
			if (inputchars[i] == 'z' || inputchars[i] == 'Z') {
				code = code + "26 ";
			}
			if (inputchars[i] == ' ') {
				code = code + "  ";
			}
		}
		return code;
	}

	String decode(String input) {
		String code = "";
		String currentLetter = "";
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ' ') {
				if (currentLetter.equals("1") || currentLetter.equals("A")) {
					code = code + "a";
				}
				if (currentLetter.equals("2") || currentLetter.equals("B")) {
					code = code + "b";
				}
				if (currentLetter.equals("3") || currentLetter.equals("C")) {
					code = code + "c";
				}
				if (currentLetter.equals("4") || currentLetter.equals("D")) {
					code = code + "d";
				}
				if (currentLetter.equals("5") || currentLetter.equals("E")) {
					code = code + "e";
				}
				if (currentLetter.equals("6") || currentLetter.equals("F")) {
					code = code + "f";
				}
				if (currentLetter.equals("7") || currentLetter.equals("G")) {
					code = code + "g";
				}
				if (currentLetter.equals("8") || currentLetter.equals("H")) {
					code = code + "h";
				}
				if (currentLetter.equals("9") || currentLetter.equals("I")) {
					code = code + "i";
				}
				if (currentLetter.equals("10") || currentLetter.equals("J")) {
					code = code + "j";
				}
				if (currentLetter.equals("11") || currentLetter.equals("K")) {
					code = code + "k";
				}
				if (currentLetter.equals("12") || currentLetter.equals("L")) {
					code = code + "l";
				}
				if (currentLetter.equals("13") || currentLetter.equals("M")) {
					code = code + "m";
				}
				if (currentLetter.equals("14") || currentLetter.equals("N")) {
					code = code + "n";
				}
				if (currentLetter.equals("15") || currentLetter.equals("O")) {
					code = code + "o";
				}
				if (currentLetter.equals("16") || currentLetter.equals("P")) {
					code = code + "p";
				}
				if (currentLetter.equals("17") || currentLetter.equals("Q")) {
					code = code + "q";
				}
				if (currentLetter.equals("18") || currentLetter.equals("R")) {
					code = code + "r";
				}
				if (currentLetter.equals("19") || currentLetter.equals("S")) {
					code = code + "s";
				}
				if (currentLetter.equals("20") || currentLetter.equals("T")) {
					code = code + "t";
				}
				if (currentLetter.equals("21") || currentLetter.equals("U")) {
					code = code + "u";
				}
				if (currentLetter.equals("22") || currentLetter.equals("V")) {
					code = code + "v";
				}
				if (currentLetter.equals("23") || currentLetter.equals("W")) {
					code = code + "w";
				}
				if (currentLetter.equals("24") || currentLetter.equals("X")) {
					code = code + "x";
				}
				if (currentLetter.equals("25") || currentLetter.equals("Y")) {
					code = code + "y";
				}
				if (currentLetter.equals("26") || currentLetter.equals("Z")) {
					code = code + "z";
				}
				if (currentLetter.equals("   ")) {
					code = code + " ";
				}
				currentLetter = "";
			} else {
				currentLetter += input.charAt(i);
			}
		}
		return code;
	}
}

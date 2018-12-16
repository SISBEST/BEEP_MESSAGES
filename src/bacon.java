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

public class bacon implements ActionListener {
	JPanel p = new JPanel();
	JFrame f = new JFrame("Encode/Decode: Baconian");
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
			try {
				PrintWriter out = new PrintWriter(new File("decoded.beepm"));
				String op = "Sorry!";
				out.println(op);
				op = "Decoding the Baconian Cipher is not yet supported.";
				out.println(op);
				op = "Please use the key at https://en.wikipedia.org/wiki/Bacon%27s_cipher to decode a message.";
				out.println(op);
				out.close();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}

	String encode(String input) {
		String code = "";
		String currentLetter = "";
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ' ') {
				if (currentLetter.equals("a") || currentLetter.equals("A")) {
					code = code + "aaaaa";
				}
				if (currentLetter.equals("b") || currentLetter.equals("B")) {
					code = code + "aaaab";
				}
				if (currentLetter.equals("c") || currentLetter.equals("C")) {
					code = code + "aaaba";
				}
				if (currentLetter.equals("d") || currentLetter.equals("D")) {
					code = code + "aaabb";
				}
				if (currentLetter.equals("e") || currentLetter.equals("E")) {
					code = code + "aabaa";
				}
				if (currentLetter.equals("f") || currentLetter.equals("F")) {
					code = code + "aabab";
				}
				if (currentLetter.equals("g") || currentLetter.equals("G")) {
					code = code + "aabba";
				}
				if (currentLetter.equals("h") || currentLetter.equals("H")) {
					code = code + "aabbb";
				}
				if (currentLetter.equals("i") || currentLetter.equals("I")) {
					code = code + "abaaa";
				}
				if (currentLetter.equals("j") || currentLetter.equals("J")) {
					code = code + "abaab";
				}
				if (currentLetter.equals("k") || currentLetter.equals("K")) {
					code = code + "ababa";
				}
				if (currentLetter.equals("l") || currentLetter.equals("L")) {
					code = code + "ababb";
				}
				if (currentLetter.equals("m") || currentLetter.equals("M")) {
					code = code + "abbaa";
				}
				if (currentLetter.equals("n") || currentLetter.equals("N")) {
					code = code + "abbab";
				}
				if (currentLetter.equals("o") || currentLetter.equals("O")) {
					code = code + "abbba";
				}
				if (currentLetter.equals("p") || currentLetter.equals("P")) {
					code = code + "abbbb";
				}
				if (currentLetter.equals("q") || currentLetter.equals("Q")) {
					code = code + "baaaa";
				}
				if (currentLetter.equals("r") || currentLetter.equals("R")) {
					code = code + "baaab";
				}
				if (currentLetter.equals("s") || currentLetter.equals("S")) {
					code = code + "baaba";
				}
				if (currentLetter.equals("t") || currentLetter.equals("T")) {
					code = code + "baabb";
				}
				if (currentLetter.equals("u") || currentLetter.equals("U")) {
					code = code + "babaa";
				}
				if (currentLetter.equals("v") || currentLetter.equals("V")) {
					code = code + "babab";
				}
				if (currentLetter.equals("w") || currentLetter.equals("W")) {
					code = code + "babba";
				}
				if (currentLetter.equals("x") || currentLetter.equals("X")) {
					code = code + "babbb";
				}
				if (currentLetter.equals("y") || currentLetter.equals("Y")) {
					code = code + "bbaaa";
				}
				if (currentLetter.equals("z") || currentLetter.equals("Z")) {
					code = code + "bbaab";
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

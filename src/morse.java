import java.applet.AudioClip;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import javax.swing.*;
public class morse implements ActionListener {
JFrame f  = new JFrame();
JButton get = new JButton("View Morse Code Alphabet");
JButton sh = new JButton(".");
JButton ln = new JButton("_");
JPanel p = new JPanel();
	void setup() {
		get.addActionListener(this);
		sh.addActionListener(this);
		ln.addActionListener(this);
		f.setVisible(true);
		p.add(get);
		p.add(sh);
		p.add(ln);
		f.add(p);
	    f.pack();
}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton bp = (JButton) e.getSource();
		if(bp == get) {
			Desktop desktop=Desktop.getDesktop();
			try {
				desktop.browse(new URL("http://apps.samuelsharp.com/Resources/BEEP_Messages/morse.png").toURI());
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
		}
		else if(bp == sh) {
			playSound("sh.wav");
		}
		else {
			playSound("ln.wav");
			
		}
	}
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	     sound.play();
	}
}

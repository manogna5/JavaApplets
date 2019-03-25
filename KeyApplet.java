package sample;
/*<applet code="KeyApplet" width=500 height=500>
  </applet>
*/
import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;
public class KeyApplet extends Applet implements KeyListener{
	 Image pic3;
public void init()
{
	addKeyListener(this);
	setForeground(Color.red);
	
}
public void keyPressed(KeyEvent ke) {
	showStatus("key is pressed");
	
}
public void keyReleased(KeyEvent ke) {
	showStatus("key is relaesde");
	pic3=getImage(getDocumentBase(),"Samantha-Naga-Chaitanyas-Marriage-this-Year.jpg");
	repaint();
}
public void keyTyped(KeyEvent ke) {
	setBackground(Color.blue);
	showStatus("key is typed");
	
}
public void paint(Graphics g) {
	g.drawImage(pic3, 150, 150, this);
}
}

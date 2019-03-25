package sample;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class Add extends Applet implements ActionListener{
TextField s,s1;
public void init()
{
	Label namep=new Label("Num1:",Label.RIGHT);
	Label passp=new Label("Num2",Label.RIGHT);
	s=new TextField(5);
	s1=new TextField(5);
	add(namep);
	add(s);
	add(passp);
	
	add(s1);
	s.addActionListener(this);
	s1.addActionListener(this);
}
public void actionPerformed(ActionEvent ae) {
	repaint();
}
	public void paint(Graphics g) {
	String m,m1;
		m=s.getText();
		m1=s1.getText();
		int k=Integer.parseInt(m);
		int k2=Integer.parseInt(m1);
		int k3=k+k2;
		g.drawString("num1:"+s.getText(), 6, 60);
		g.drawString("num2:"+s1.getText(), 6,80);
		g.drawString(""+k3, 7,100);
		
	}
}

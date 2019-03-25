package sample;
import java.awt.*;
import java.applet.Applet;
import java.awt.*;
public class MyApplet extends Applet {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
String msg;

	public void init()
	{
	setBackground(Color.cyan);
	setForeground(Color.red);
	msg="ïnside init()";
	}
	public void start()
	{
	msg=msg+"ïnside start()";
	}
	public void paint(Graphics g)
	{
	Font f=new Font("TimesNewRoman",Font.ITALIC,36);
	g.setFont(f);
	g.setColor(Color.blue);
	g.drawString(msg,10,30);
	Font c=new Font("Jokerman",Font.BOLD,12);
	g.setFont(c);
	g.setColor(Color.green);
	g.drawString("h",90,70);
}
}

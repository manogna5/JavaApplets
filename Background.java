package sample;

import java.applet.*;
import java.awt.*;
/*<applet code="BackgroundChange" width=500 height=500>
 </applet>
 */
public class Background  extends Applet implements Runnable 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Thread t;
	String msg;
	public void init() {
		setForeground(Color.BLACK);
		}
	public void start()
	{
		msg="manogna";
		t=new Thread(this,"");
		t.start();
	}
	public void run()
	{
		while(true)
		{
			try
			{
				
				
			setBackground(Color.red);
			repaint();
			Thread.sleep(1000);
			setBackground(Color.green);
			repaint();
			Thread.sleep(1000);
		    setBackground(Color.BLUE);
			repaint();	
			Thread.sleep(1000);
			setBackground(Color.CYAN);
			repaint();	
			Thread.sleep(1000);
			setBackground(Color.GRAY);
			repaint();	
			Thread.sleep(1000);
			setBackground(Color.YELLOW);
			repaint();	
			Thread.sleep(1000);
			setBackground(Color.MAGENTA);
			repaint();	
			Thread.sleep(1000);
			setBackground(Color.pink);
			repaint();	
			Thread.sleep(1000);
			setBackground(Color.orange);
			repaint();	
			Thread.sleep(1000);
			setBackground(Color.DARK_GRAY);
			repaint();	
			Thread.sleep(1000);
			

		}
			catch(InterruptedException e)
			{
			System.out.println(e);
	}
		}
	}
	public void paint(Graphics g)
	{
		Font f=new Font("Digital-7",Font.BOLD,250);
		g.setFont(f);
		g.drawString(msg, 250, 250);
		
	}

}
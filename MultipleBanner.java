package sample;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class MultipleBanner extends Applet implements Runnable {
	 
		private static final long serialVersionUID = 1L;
	String msg="i love u";
	String msg1="God";
	Thread t=null;
	//int state;
	volatile boolean stopFlag;
	public void init()
	{
		setBackground(Color.black);
		setForeground(Color.red);
		
	}
	public void start()
	{
		t=new Thread(this);
		stopFlag=false;
		t.start();
		
		
	}
	public void run()
	{
		for(; ;)
		{
			try
			{
				repaint();
				Thread.sleep(250);
				if(stopFlag)
					break;
			}
			catch(InterruptedException e)
			{
			}
		}
	}
	public void stop()
	{
		stopFlag=true;
		t=null;
	}
		public void paint(Graphics g) {
			char ch;
			char ch1;
			ch=msg.charAt(0);
			msg=msg.substring(1, msg.length());
			msg+=ch;
			ch1=msg1.charAt(0);
			msg1=msg1.substring(1,msg1.length());
			msg1+=ch1;
			
			g.drawString(msg, 50, 30);
			g.drawString(msg1, 50, 50);
		}
	}





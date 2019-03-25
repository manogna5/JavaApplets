package sample;
import java.util.*;
import java.applet.Applet;
import java.awt.*;
import java.util.Calendar;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
public class DigitalClock extends Applet implements Runnable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Thread t=null;
	int state;
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
	public void paint(Graphics g)
	{      //g.drawOval(40, 40,60, 60);
		 Calendar cal = new GregorianCalendar();
	      String hour = String.valueOf(cal.get(Calendar.HOUR));
	      String minute = String.valueOf(cal.get(Calendar.MINUTE));
	      String second = String.valueOf(cal.get(Calendar.SECOND));
	      g.drawString(hour + ":" + minute + ":" + second, 20, 30);
	   }
}

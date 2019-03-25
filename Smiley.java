package sample;

import java.applet.Applet;
import java.awt.*;
public class Smiley extends Applet implements Runnable {

	
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		Thread t=null;
		int x=-180;
		int y=50;
		 int radius=4;
		volatile boolean stopflag=false;
	public void init()
	{
		setBackground(Color.cyan);
		
	}
	public void start()
	{
		t=new Thread(this);
		stopflag=false;
		t.start();
		
	}
	public void run()
	{
		for(; ;)
		{
			try
			{    if(x<0)
			
				x=x+3;
			
				else
					x=-180;
			
			repaint();
				Thread.sleep(500);
			    if(stopflag)
			    	break;
			    
			}
			catch(InterruptedException e) {}
		}
	}
	public void stop()
	{
		stopflag=true;
		t=null;
	}

 

       
        public void paint(Graphics g){
               
                Font f = new Font("Jokerman", Font.BOLD,20);
                g.setFont(f);
                g.drawString("Nothing is more beautiful than a smile struggled through tears!!!", 50, 30);
                g.drawOval(60, 60, 200, 200);
                g.fillOval(90, 120, 50, 20);
                g.fillOval(190, 120, 50, 20);
                g.drawLine(165, 125, 165, 175);
                g.drawArc(110, 130, 95, 95, 0, x);
        }
}


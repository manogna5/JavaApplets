package sample;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class watch extends Applet implements Runnable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String msg="Trust the timing of your lyf!!!!";
int theta;
double r;
double sectheta,mintheta,hrstheta;
int x1,x2,y1,y2;
public void run()
{
	while(true)
	{    try {
		Thread.sleep(1000);
	}
	catch(InterruptedException e) {
		
	}
	sectheta=sectheta+6;
	mintheta=mintheta+6.0/60;
	hrstheta=hrstheta+30.0/3600;
	repaint();
}

	}
	public void init()
	{
		sectheta=270;
		mintheta=270;
		hrstheta=270;
		Thread th=new Thread(this);
		th.start();
		setBackground(Color.gray);
	}
	public void paint(Graphics g)
	{       char ch;
	         
	        ch=msg.charAt(0);
	        msg=msg.substring(1, msg.length());
	        msg+=ch;
	        g.drawString(msg, 50, 30);
	        showStatus("Manogna");
		g.drawOval(50, 50, 200, 200);
		theta=0;
		while(theta<=360) {
			r=Math.toRadians(theta);
			x1=(int)(100*Math.cos(r));
			y1=(int)(100*Math.sin(r));
			x2=(int)(80*Math.cos(r));
			y2=(int)(80*Math.sin(r));
			g.drawLine(150+x1,150+y1, 150+x2, 150+y2);
			theta=theta+30;
			
		}
		theta=0;
		while(theta<=360) {
			r=Math.toRadians(theta);
			x1=(int)(100*Math.cos(r));
			y1=(int)(100*Math.sin(r));
			x2=(int)(90*Math.cos(r));
			y2=(int)(90*Math.sin(r));
			g.drawLine(150+x1,150+y1, 150+x2, 150+y2);
			theta=theta+6;
		}
		g.drawLine(150, 150, 150+(int)(75*Math.cos(Math.toRadians(sectheta))), 150+(int)(75*Math.sin(Math.toRadians(sectheta))));
		g.drawLine(150, 150, 150+(int)(65*Math.cos(Math.toRadians(mintheta))), 150+(int)(65*Math.sin(Math.toRadians(mintheta))));
		g.drawLine(150, 150, 150+(int)(55*Math.cos(Math.toRadians(hrstheta))), 150+(int)(55*Math.sin(Math.toRadians(hrstheta))));
	}
}

import java.applet.Applet;
import java.awt.*;
/*<applet code="Polygon" width=200 height=200>
  
 */
public class Polygon extends Applet implements Runnable{
	Thread t=null;
	volatile boolean stopflag=false;
	int x1=10,x2=11;
	int y1=140,y2=160;
	int x3=40,y3=160;
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
			{
			if(x1<200&& x2<200&&x3<200)	{
			x1=x1+50;
			x2=x2+50;
			x3=x3+50;
			}
			else
			{
				x1=0;
				x2=0;
				x3=0;
			}
			repaint();
				
			//y1=y1+10;
			
				Thread.sleep(1000);
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

public void paint(Graphics g) {
	int x[]= {40,100,70};
	int y[]= {80,80,50};
	//g.drawRect(x1, y1, 30, 30);
	//g.fillRect(x1, y1, 30, 30);
	//int num=3;
	String msg="GoSlow";
	g.drawRect(160, 80, 10, 80);
	//g.setColor(Color.yellow);
	g.fillRect(160, 80, 10, 80);
	g.drawRect(0, 150, 900, 30);
	g.fillRect(0, 150, 900, 30);
	g.setColor(Color.white);
	g.drawRect(10,160, 20, 5);
	g.fillRect(10,160, 20, 5);
	g.drawRect(40,160, 20, 5);
	g.fillRect(40,160, 20, 5);
	g.drawRect(70,160, 20, 5);
	g.fillRect(70,160, 20, 5);
	g.drawRect(100,160, 20, 5);
	g.fillRect(100,160, 20, 5);
	g.drawRect(130,160, 20, 5);
	g.fillRect(130,160, 20, 5);
	
	g.drawRect(160,160, 20, 5);
	g.fillRect(160,160, 20, 5);
	g.setColor(Color.yellow);
	
	g.drawOval(140, 40, 50, 50);
	g.fillOval(140, 40, 50, 50);
	g.setColor(Color.red);
	g.drawString(msg, 140, 60);
	setBackground(Color.cyan);
	g.setColor(Color.black);
	g.drawPolygon(x, y, 3);
	g.fillPolygon(x, y, 3);
	
	g.setColor(Color.pink);
	g.drawRect(40,80,60,50);
	g.fillRect(40,80,60,50);
	g.setColor(Color.black);
	//g.drawRect(0, 150, 900, 30);
	//g.fillRect(0, 150, 900, 30);
	g.drawRect(0, 50, 20, 80);
	g.setColor(Color.orange);
	g.fillRect(0, 50, 20, 80);
	g.drawRect(0,180,900,20);
	g.setColor(Color.black);
	g.drawRect(20, 20, 20, 110);
	g.setColor(Color.LIGHT_GRAY);
	g.fillRect(20, 20, 20, 110);
	g.setColor(Color.gray);
	
	g.drawRect(3, 60, 5, 5);
	g.drawRect(13, 60, 5, 5);/*for small rectangles in building1*/
	g.drawRect(3, 70, 5, 5);
	g.drawRect(13, 70, 5, 5);
	g.drawRect(3, 80, 5, 5);
	g.drawRect(13, 80, 5, 5);
	g.drawRect(3, 90, 5, 5);
	g.drawRect(13, 90, 5, 5);
	g.drawRect(3, 100, 5, 5);
	g.drawRect(13, 100, 5, 5);
	g.drawRect(3, 110, 5, 5);
	g.drawRect(13, 110, 5, 5);
	g.drawRect(3, 120, 5, 5);
	g.drawRect(13, 120, 5, 5);
	/******************************/
	g.drawRect(23, 30, 5, 5);
	g.drawRect(33, 30, 5, 5);/*for small rectangles in building1*/
	g.drawRect(23, 40, 5, 5);
	g.drawRect(33, 40, 5, 5);
	g.drawRect(23, 50, 5, 5);
	g.drawRect(33, 50, 5, 5);
	
	g.drawRect(23, 60, 5, 5);
	g.drawRect(33, 60, 5, 5);/*for small rectangles in building1*/
	g.drawRect(23, 70, 5, 5);
	g.drawRect(33, 70, 5, 5);
	g.drawRect(23, 80, 5, 5);
	g.drawRect(33, 80, 5, 5);
	g.drawRect(23, 90, 5, 5);
	g.drawRect(33, 90, 5, 5);
	g.drawRect(23, 100, 5, 5);
	g.drawRect(33, 100, 5, 5);
	g.drawRect(23, 110, 5, 5);
	g.drawRect(33, 110, 5, 5);
	g.drawRect(23, 120, 5, 5);
	g.drawRect(33, 120, 5, 5);
	/*****************/
	g.drawRect(60, 100, 20, 30);
	//g.setColor(Color.orange);
	g.fillRect(60, 100, 20, 30);
	g.setColor(Color.green);
	g.fillRect(0, 180, 900, 20);
	g.drawRect(0, 130, 900, 20);
	g.fillRect(0, 130, 900, 20);
	g.setColor(Color.blue);
	g.drawRect(x1, y1, 30, 20);
	g.fillRect(x1, y1, 30, 20);
	g.drawRect(x1+30, y1+10, 10, 10);
	g.fillRect(x1+30, y1+10, 10,10);
	//g.setColor(Color.gray);
	g.drawOval(x2,y2,5,5);
	g.fillOval(x2,y2,5,5);
	g.drawOval(x3,y3,5,5);
	g.fillOval(x3,y3,5,5);
	
	showStatus("Created by:Manogna");
}
}

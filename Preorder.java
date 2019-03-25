package sample;
import java.awt.color.*;
import java.applet.Applet;
import java.awt.*;
public class Preorder extends Applet implements Runnable{

	Thread t;
	int c;
	String s,msg,s1,s2,s3,s4,s5,s6,s7,msg1,msg2;
	Font f;
	public void init()
	{
		s=new String();
		msg=new String();
		msg="PREORDER-TRAVERSAL(BST)";
		msg1="NODE LEFT RIGHT";
		msg2="First print the node then go to left of node and then to right";
		s="a";
		c=1;
		f=new Font("Arial",Font.BOLD,40);
		t=new Thread(this);
		setBackground(Color.cyan);
		
	}
	public void start()
	{
		t.start();
		
	}
	public void run()
	{
		for(;;)
		{
			try {
				if(c==1)
				{
					Thread.sleep(2000);
					repaint();
					c=2;
					s="a";
					
				}
				else if(c==2)
				{
					Thread.sleep(2000);
					repaint();
					c=3;
					s="ab";
					
				}
				else if(c==3)
				{
					Thread.sleep(2000);
					repaint();
					c=4;
					s="abc";
					
				}
				else if(c==4)
				{
					Thread.sleep(2000);
					repaint();
					c=5;
					s="abcd";
				}
				else if(c==5)
				{
					Thread.sleep(2000);
					repaint();
					c=6;
					s="abcde";
				}
				else if(c==6)
				{
					Thread.sleep(2000);
					repaint();
					c=7;
					s="abcdef";
				}
				else if(c==7)
				{
					Thread.sleep(2000);
					repaint();
					c=1;
					s="abcdefg";
				}
				
			}
			catch(InterruptedException e)
			{
				
			}
		}
	}
	public void paint(Graphics g) {
		g.setFont(f);
		if(c==1)
		{g.setColor(Color.MAGENTA);
		g.fillOval(200,50,50,50);
		//drawString("a",400,110);
		}
		if(c==2)
		{g.setColor(Color.MAGENTA);
		g.fillOval(130,140,50,50);
		
		}
		if(c==3)
		{g.setColor(Color.MAGENTA);
		g.fillOval(40,250,50,50);
		}
		
		if(c==4)
		{g.setColor(Color.MAGENTA);
		g.fillOval(200,250,50,50);
		}
		if(c==5)
		{g.setColor(Color.MAGENTA);
		g.fillOval(270,370,50,50);
		}
		if(c==6)
		{g.setColor(Color.MAGENTA);
		g.fillOval(270,140,50,50);
		}
		if(c==7)
		{g.setColor(Color.MAGENTA);
		g.fillOval(370,250,50,50);
		}
		
		
		
		
		g.drawOval(200, 50, 50, 50);//root
		g.drawLine(202,90,150,140);
	
		g.drawOval(130, 140, 50, 50);//
		g.drawLine(245, 90, 290,140 );
		g.drawOval(270, 140, 50, 50);//
		g.drawOval(40, 250, 50, 50);//
		g.drawOval(200, 250,50, 50);//
		g.drawOval(270, 370, 50, 50);//
		g.drawOval(370,250,50,50);//
		g.drawLine(60,250,140,185);
		g.drawLine(170, 185, 220, 250);
		g.drawLine(240, 290, 290,370);
		g.drawLine(320,170,390,250);
		g.setColor(Color.BLACK);
		g.drawString("a",215,90);
		g.drawString("b",140,174);
		g.drawString("c",50,280);
		g.drawString("d",215,290);
		g.drawString("e",280,400);
		g.drawString("f",290,170);
		g.drawString("g",380,280);
		g.drawString(msg1,490,110);
		g.drawString(msg2, 200, 500);
		//g.drawString("a,b,c,d,e,f,g",500,170);
				
			g.drawString(s, 500, 200);	
				
			showStatus("Manogna.Tata,Mounika,Pavan");
				
				
		
		g.drawString(msg,400,50);
	}
}

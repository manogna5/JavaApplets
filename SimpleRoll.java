package sample;

import java.applet.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import SpinFilter;

public class SimpleRoll extends Applet
    implements Runnable
{
    private boolean init = false;
    Image myImage = null;
    Image allImages[] = null;
    Thread animation = null;
    MediaTracker tracker = null;
    int roll_x = 0;                // where to draw
    boolean complete = false;
    int current = 0;

    /**
     * Standard initialization method for an applet
     */
    public void init()
    {
        if ( init == false )
        {
            init = true;
            tracker = new MediaTracker(this);
            allImages = new Image[4];
            allImages[0] = getImage(getCodeBase(), "Samantha-Naga-Chaitanyas-Marriage-this-Year");
            allImages[1] = getImage(getCodeBase(), "Samantha-Naga-Chaitanyas-Marriage-this-Year");
            allImages[2] = getImage(getCodeBase(), "Samantha-Naga-Chaitanyas-Marriage-this-Year");
            allImages[3] = getImage(getCodeBase(), "nagachaitanya-samantha-wedding2");
            for ( int x = 0; x < 4; x++ )
                tracker.addImage(allImages[x], x);
        }
    }

    /**
     * Standard paint routine for an applet. 
     * @param g contains the Graphics class to use for painting
     */
    public void paint(Graphics g)
    {
        if ( complete )
        {
            g.drawImage(allImages[current], roll_x, 40, this);
        }
        else
        {
            g.drawString("Images not yet loaded", 0, 20);
        }
    }

    public void start()
    {
        if ( animation == null )
        {
            animation = new Thread(this);
            animation.start(); 
        }
    }

    @SuppressWarnings("deprecation")
	public void stop()
    {
        if ( animation != null )
        {
            animation.stop(); 
            animation = null;
        }
    }

    @SuppressWarnings("deprecation")
	public void run()
    {
        while ( !checkRoll() ) sleep(250);
        complete = true; 
        while (true)
        {
            roll(0, this.size().width-42);      // roll left to right
            roll(this.size().width-42, 0);      // roll right to left
        }
    }

    boolean checkRoll()
    {
        boolean finished = true;
        for ( int i = 0; i < 4; i++ )
        {
            if ( (tracker.statusID(i, true) & MediaTracker.COMPLETE) == 0 )
                finished = false;
        }
        return finished; 
    }

    void roll(int begin, int end)
    {
        if ( begin < end )
        {
            for ( int x = begin; x <= end; x += 21 )
            { 
                roll_x = x;
                repaint(); 
                current--; 
                if ( current == -1 ) current = 3;
                sleep(150); 
            } 
        }
        else
        {
            for ( int x = begin; x >= end; x -= 21 )
            { 
                roll_x = x;
                repaint(); 
                current++; 
                if ( current == 4 ) current = 0;
                sleep(150); 
            } 
        }
    }

    /**
     * A simple sleep routine
     * @param a the number of milliseconds to sleep
     */
    private void sleep(int a)
    {
        try
        {
            Thread.currentThread().sleep(a); 
        }
        catch (InterruptedException e)
        {
        }
    }
}
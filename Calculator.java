package sample;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
//import java.util.*;
/*
<applet code="Calculator1" width=250 height=200>
</applet>
*/
public class Calculator extends Applet implements ActionListener{
	String msg;
    int v1,v2,result;
	char OP;
       
	
		TextField tf;
	    protected void makebutton(String name,
	                              GridBagLayout gridbag,
	                              GridBagConstraints c) {
	        Button button = new Button(name);
	        gridbag.setConstraints(button, c);
	        add(button);
	        button.addActionListener(this);
	        
	    }

	    public void init() {
	        GridBagLayout gridbag = new GridBagLayout();
	        GridBagConstraints c = new GridBagConstraints();
            
	        setFont(new Font("SansSerif", Font.PLAIN, 14));
	        setLayout(gridbag);
	        tf=new TextField();
	       c.gridx = 0;
            c.gridy = 0;
            c.fill = GridBagConstraints.HORIZONTAL;
            c.weightx = .5; 
            
           add(tf , c);
           //add(new TextField(100));
            
            c.fill = GridBagConstraints.BOTH;
            c.weightx = 1.0;
            c.gridx=0;
            c.gridy=2;
            //c.gridwidth = GridBagConstraints.RELATIVE; 
            /*Button b1 = new Button("1");
	        gridbag.setConstraints(b1, c);
	        add(b1);*/
            
            makebutton("1", gridbag, c);
            c.weightx = 2.0;
            c.gridx=1;
            c.gridy=2;
            makebutton("2", gridbag, c);
            c.weightx = 2.0;
            c.gridx=2;
            c.gridy=2;
            makebutton("3", gridbag, c);
            c.weightx = 2.0;
            c.gridx=3;
            c.gridy=2;
            makebutton("/", gridbag, c);
            //c.gridx=3;
            //c.gridy=3;
           // c.gridwidth = GridBagConstraints.REMAINDER; //end row
            //makebutton("4", gridbag, c);

            c.weightx = 2.0;  
            c.gridx=0;
            c.gridy=3;
            //reset to the default
            makebutton("4", gridbag, c); //another row
            c.gridx=1;
            c.gridy=3;
            
            makebutton("5", gridbag, c);
            c.gridx=2;
            c.gridy=3;
           // c.gridwidth = GridBagConstraints.REMAINDER; //end row
            makebutton("6", gridbag, c);
            c.gridx=3;
            c.gridy=3;
           // c.gridwidth = GridBagConstraints.REMAINDER; //end row
            makebutton("*", gridbag, c);
            c.gridx=0;
            c.gridy=4;
           // c.gridwidth = GridBagConstraints.REMAINDER; //end row
            makebutton("7", gridbag, c);
            c.gridx=1;
            c.gridy=4;
           // c.gridwidth = GridBagConstraints.REMAINDER; //end row
            makebutton("8", gridbag, c);
            c.gridx=2;
            c.gridy=4;
           // c.gridwidth = GridBagConstraints.REMAINDER; //end row
            makebutton("9", gridbag, c);
            
           // c.gridwidth = GridBagConstraints.REMAINDER;
            c.gridx=3;
            c.gridy=4;
           // c.gridwidth = GridBagConstraints.REMAINDER; //end row
            makebutton("-", gridbag, c);
            c.gridx=0;
            c.gridy=5;
           // c.gridwidth = GridBagConstraints.REMAINDER; //end row
            makebutton("clr", gridbag, c);
            c.gridx=1;
            c.gridy=5;
           // c.gridwidth = GridBagConstraints.REMAINDER; //end row
            makebutton("0", gridbag, c);
            c.gridx=2;
            c.gridy=5;
           // c.gridwidth = GridBagConstraints.REMAINDER; //end row
            makebutton("M", gridbag, c);
            c.gridx=0;
            c.gridy=6;
           // c.gridwidth = GridBagConstraints.REMAINDER; //end row
            makebutton("AC", gridbag, c);
            c.gridx=1;
            c.gridy=6;
           // c.gridwidth = GridBagConstraints.REMAINDER; //end row
            makebutton("ON", gridbag, c);
            c.gridx=2;
            c.gridy=6;
           // c.gridwidth = GridBagConstraints.REMAINDER; //end row
            makebutton("=", gridbag, c);
            
            c.gridx=3;
            c.gridy=5;
            c.gridwidth = 1;                //reset to the default
            c.gridheight = 2;
            c.weighty = 1.0;
            makebutton("+", gridbag, c);

            
            
           /* c.weighty = 0.0;                //reset to the default
            c.gridwidth = GridBagConstraints.REMAINDER; //end row
            c.gridheight = 1;               //reset to the default
            makebutton("Button9", gridbag, c);
            makebutton("Button10", gridbag, c);*/
            
            setSize(200, 200);
        }
	    public void paint(Graphics g) {
	    	showStatus("Manogna.Tata");
	    }
	    public void actionPerformed(ActionEvent ae) {

			String str=ae.getActionCommand();
			char ch=str.charAt(0);
			if ( Character.isDigit(ch))
			tf.setText(tf.getText()+str);
			else
			if(str.equals("+"))
			{
				v1=Integer.parseInt(tf.getText());
				OP='+';
				tf.setText("");
			}
			else if(str.equals("-"))
			{
				v1=Integer.parseInt(tf.getText());
				OP='-';
				tf.setText("");
			}
			else if(str.equals("*"))
			{
				v1=Integer.parseInt(tf.getText());
				OP='*';
				tf.setText("");
			}
			else if(str.equals("/"))
			{
				v1=Integer.parseInt(tf.getText());
				OP='/';
				tf.setText("");
			}
			else if(str.equals("m"))
			{
				v1=Integer.parseInt(tf.getText());
				OP='%';
				tf.setText("");
			}
			if(str.equals("="))
			{
				v2=Integer.parseInt(tf.getText());
				if(OP=='+')
					result=v1+v2;
				else if(OP=='-')
					result=v1-v2;
				else if(OP=='*')
					result=v1*v2;
				else if(OP=='/')
					result=v1/v2;
				else if(OP=='%')
					result=v1%v2;
				tf.setText(""+result);
			}	
			if(str.equals("clr"))
			{
				tf.setText("");
			}
                        if(str.equals("AC"))
			{
				tf.setText("");
                         
			}
                        if(str.equals("ON"))
			{
				tf.setText("");
			}
			
		}
	    	
	 
	  

}


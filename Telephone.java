package sample;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class Telephone extends Applet implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
 TextField tf;
 String str,msg;
	public void init()
	{
       
		
		 tf=new TextField(200);
		 add(tf);
		 setLayout(new GridLayout(6,3));
		 Button b1=new Button("");
		 Button b2=new Button("");
		 Button b3=new Button("1");
		 Button b4=new Button("2ABC");
		 Button b5=new Button("3DEF");
		 Button b6=new Button("4GHI");
		 Button b7=new Button("5JKL");
		 Button b8=new Button("6MNO");
		 Button b9=new Button("7PQRS");
		 Button b0=new Button("8TUV");
		 Button b=new Button("9WXYZ");
		 
		 Button bx=new Button("+*#");
		 Button bb=new Button("0");
		 Button ba=new Button("x");
		 
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b0);
		add(b);
		add(bx);
		add(ba);
		add(bb);
		
		bb.addActionListener(this);
		//b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b0.addActionListener(this);
		b.addActionListener(this);
		bx.addActionListener(this);
		ba.addActionListener(this);

		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		str=ae.getActionCommand();
		if(str.equals("1"))
		{   msg=tf.getText();
			tf.setText(msg+"1");
		}
		else if(str.equals("2ABC"))
		{ msg=tf.getText();
		tf.setText(msg+"2");
			
		}
		else if(str.equals("3DEF"))
		{ msg=tf.getText();
			tf.setText(msg+"3");
		}
		else if(str.equals("4GHI"))
		{ msg=tf.getText();
			tf.setText(msg+"4");
		}
		else if(str.equals("5JKL"))
		{ msg=tf.getText();
			tf.setText(msg+"5");
		}
		else if(str.equals("6MNO"))
		{ msg=tf.getText();
			tf.setText(msg+"6");
		}
		else if(str.equals("7PQRS"))
		{ msg=tf.getText();
			tf.setText(msg+"7");
		}
		else if(str.equals("8TUV"))
		{ msg=tf.getText();
			tf.setText(msg
					+"8");
		}
		else if(str.equals("9WXYZ"))
		{ msg=tf.getText();
			tf.setText(msg+"9");
		}
		else if(str.equals("0"))
		{ msg=tf.getText();
			tf.setText(msg+"0");
		}
		else if(str.equals("+*#"))
		{ msg=tf.getText();
			tf.setText(msg+"+*#");
		}
		else
		{ msg=tf.getText();
			tf.setText("");
		}
		
	}

}

package sample;
//import java.awt.*;
import java.applet.*;
import java.net.*;
public class Appcon extends Applet
{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void start()
{
AppletContext ae=getAppletContext();
URL url=getCodeBase();
try{
ae.showDocument(new URL(url+"page.htm"));
}
catch(MalformedURLException e)
{
showStatus("URL not found");
}
}
}

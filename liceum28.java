import liceum28.*;
import java.awt.*;
import java.awt.Graphics.*;
import java.applet.*;


public class liceum28 extends Applet
{
	public void init()
   {    
	      lo28.init(getSize());
          setBackground(lo28.tlo);  // lub jakikolwiek inny kolor
   }
//-----------------------------
void rysunek(Graphics g)
{
pkt2d p=new pkt2d(2,1);
pkt2d k=new pkt2d(6,4);


lo28.linia(g,p,k);

lo28.wspolrzedne(g,p ,"p");
lo28.wspolrzedne(g,k,"k");
p.war(-4,4);
	
}

	public void paint(Graphics g)
	{
		g.drawString("Pakiet lo28", 20, 20);
		lo28.uklad(g);
		rysunek(g);
	}
}	

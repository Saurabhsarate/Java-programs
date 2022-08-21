import java.awt.*;
import java.applet.*;
/* <applet code="signal"  width=400  height=600>
  </applet> */
public class signal extends Applet implements Runnable
 {
	 Thread t=null;
	 int time, cnt;
	  public void init()
	   {
           t=new Thread(this);
           time=10;
           cnt=0;
           t.start();
	   }
	   public void run()
	   {
		     try
		      {
				   while(true)
				    {
						 while(time>=0)
						 {
							 repaint();
							 Thread.sleep(1000);
							 time--;
						 }
					  cnt=(cnt+1)%3;
					   time=10;
					    if(cnt==1)
					     time=5;
					}
			  }
			  catch(Exception e)
			  {}
	   }
	  public void paint(Graphics g)
	   {
		   g.drawRect(40,50, 60,220);
           g.drawOval(45,60,50,50);
           g.drawOval(45,120,50,50);
           g.drawOval(45,180,50,50);
           g.fillRect(65,270,10,100);
           String msg="Time : "+time;
           g.drawString(msg,45,260);
             if(cnt==0)
              {
				   g.setColor(Color.green);
				  g.fillOval(45,180,50,50);
				  }
			 else if(cnt==1)
                {
				  g.setColor(Color.yellow);
				  g.fillOval(45,120,50,50);
			    }
			  else  {
				          g.setColor(Color.red);
				     	  g.fillOval(45,60,50,50);
			  		  }
	   }
 }
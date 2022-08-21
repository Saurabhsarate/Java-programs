import java.awt.*;
class frame7 extends Frame
{
	String fnm;
	public frame7(String fnm)
	{
		super(fnm);
		setSize(300,400);
		setVisible(true);
		setBackground(Color.orange);
	}
public void paint  (Graphics g)
{

	//Font f=new Font("Times New Roman",Font.BOLD,40);
	setForeground(Color.red);
	g.drawString("Good Morning ....",100,100);
	}
	public static void main(String args[])
	{
	new frame7("Demo Frame");
	}
}


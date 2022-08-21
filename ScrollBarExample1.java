import javax.swing.*;
import java.awt.event.*;
class ScrollBarExample1
{
	ScrollBarExample1()
	{
		JFrame f=new JFrame("Scrollbar Example");
		final JLabel l1=new JLabel();
		l1.setHorizontalAlignment(JLabel.CENTER);
		l1.setSize(350,100);
			final JLabel l2=new JLabel();
				l2.setHorizontalAlignment(JLabel.CENTER);
				l2.setSize(350,250);

	final JScrollBar s1=new JScrollBar(JScrollBar.VERTICAL);
	final JScrollBar s2=new JScrollBar(JScrollBar.HORIZONTAL);
		s1.setBounds(30,30,20,200);
		s2.setBounds(80,180,200,20);

		f.add(s1);
		f.add(l1);
		f.add(s2);
		f.add(l2);

		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		s1.addAdjustmentListener(new AdjustmentListener()
		{
				public void adjustmentValueChanged(AdjustmentEvent e)
				{
					l1.setText("Vertical ScrollBar value is="+s1.getValue());
				}
		});
		s2.addAdjustmentListener(new AdjustmentListener()

		{
				public void adjustmentValueChanged(AdjustmentEvent e)
				{
					l2.setText("Horizontal ScrollBar value is="+s2.getValue());
				}
		});
}
public static void main(String args[])
{
	new ScrollBarExample1();
}
}


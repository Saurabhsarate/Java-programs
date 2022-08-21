import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java .awt.Label;
class buttondemo implements ActionListener
{
	JFrame f1;
	JButton b1,b2;
	JTextField t1;
	buttondemo()
	{
		f1=new JFrame("buttondemo");
		f1.setBackground(Color.orange);
		b1=new JButton("Yes");			b2=new JButton("No");
		b1.setMnemonic('Y');	b1.setMnemonic('N');
		t1=new JTextField(20);
		f1.setSize(800,400);
		f1.setLayout(new FlowLayout());
		f1.add(t1);
		f1.add(b1);
		f1.add(b2);
		b1.addActionListener(this); 	b2.addActionListener(this);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
public  void actionPerformed(ActionEvent obj)
{
	if(obj.getSource()==b1)
		t1.setText("You clicked Yes");
		else
		t1.setText("You Clicked No");
}
public static void main(String args[])
{
	new buttondemo();
}
}
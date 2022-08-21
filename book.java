import java.util.Scanner.*;
class book
{
		int bno;	String bnm;	float price;
		Scanner s1=new Scanner(System.in);
		 void accpet()
		 {
			 	System.out.println("\n Enter the book no, book name and book price");
			 	bno=s1.nextInt();
			 	bnm=s1.next();
			 	price=s1.nextFloat();
	}
	void display()
	{
			System.out.println("\n Book no="+bno+"Book name="+bnm+"book price="+price);
}
public static void main(String args[])
{
		book b1=new book();
}
}

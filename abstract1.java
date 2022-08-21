import java.util.*;
abstract class vehicle
{
	int mileage;
	String vnm;
	abstract void accpet();
	abstract void display();
}
class twowheeler extends vehicle
{
	int cc;
	Scanner s1=new Scanner(System.in);
	void accept()
	{
	System.out.println("\n Enter the mileage,vehiclenname and cc=");
	mileage=s1.nextInt();
	vnm=s1.next();
	cc=s1.nextInt();
	}
void display()
	{
		System.out.println("\n Enter the milenge="+mileage+"\t enter the vehicle name="+vnm+"Engine capacity=>"+cc);
	}
}
class fourwheeler extends twovehicle
{
	double price;
	Scanner s1=new Scanner(System.in);
	void accept()
	{
			System.out.println("\n Enter the mil,vehicle and price=");
			mil=s1.nextInt();
			vnm=s1.next();
			price=s1.nextDouble();
    }
	void display()
	{
		System.out.println("\n Enter vehicle milenge="+mileage+"\t enter the vehicle name="+vnm+" Price="+price);
	}
}
class abstract1
{
public static void main(String args[])
{
	twowheeler t1=new twowheeler();
	fourwheeler f1=new fourwheeler();
	t1.accept();		f1.accpet();
	t1.display();		f1.display();

	vehicle ref;
	ref=new twowheeler();
	ref.accpet();		ref.display();
}
}
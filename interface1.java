interface A
{
	int x=100;
	void display();
	void show();
	void ghedata();
}
class B implements A
{
	public void display()
	{
		System.out.println(" All methods of interface by defaults abstract");
	}
	public void show()
	{
		System.out.println("Abstract methods must be override in subclass\n value of x-->"+x);
	}
	public void ghedata(){}
}
class interface1
{
	public static void main(String args[])
	{
		B b1=new B();
		b1.display();
		b1.show();
		System.out.println("Value of x out side class-->"+A.x);
	}
}
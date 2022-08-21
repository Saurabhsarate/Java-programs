class supercls
{
	int p=100;
	void cal(int x,int y)
	{
		System.out.println("Multiplication is====>"+(x*y));
	}
}
class subcls extends supercls
{
	int p=200;
	void cal(int x,int y)
	{
		super.cal(x,y);
		System.out.println("Addition="+(x+y));
		System.out.println("\n value of p="+p+"\n Value of super class p="+super.p);
	}
}
class super3
{
	public static void main(String args[])
	{
		subcls obj=new subcls();
		obj.cal(10,20);
	}
}
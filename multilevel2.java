class A
{
	int x;
	void show()
	{
		x=10;
		System.out.println("\n Hello I am Superclass show methods");
	}
}
class B extends A
{
	 int y;
	 void show()
	 {
		 super.show();
		 int y=20;
	 	System.out.println("\n Hello I am intermediate class B display methods");
	 	System.out.println("\n Addition="+(x+y));
	}
}
class C extends B
{
	int z;
	void show()
	{
		super.show();
		int z=30;
		System.out.println("\n Hello I am subclass show methods");
		System.out.println("\n multiply="+(x*y));
	}
}
class multilevel2
{
	public static void main(String args[ ])
	{
		C c1=new C();
	    c1.show();
	}
}
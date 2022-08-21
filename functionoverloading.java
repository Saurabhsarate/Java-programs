class  functionoverloading
{
	void area(int l,int b)
	{
		System.out.println("\n Area of rectangle="+(l*b));
	}
	void area(float r)
	{
		System.out.println("\n Area of circle="+(3.14f*r*r));
	}
	void area(double b,double h)
	{
		System.out.println("\n Area of triangle="+(0.5*b*h));
	}
	void area(int side)
	{
		System.out.println("\n Area of square="+(side*side));
	}
	public static void main(String args[])
	{
		functionoverloading  obj=new functionoverloading();
		obj.area(10);		      obj.area(4.2,6.4);
		obj.area(5.4f);	   	  obj.area(4,5);
	}
}
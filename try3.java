class try3
{
	public static void main(String args[])
	{
	try
		{
			System.out.println("Within try block");
		 	int a=Integer.parseInt(args[0]);
		 	int b=Integer.parseInt(args[1]);
		 	int c=a/b;
		 	System.out.println(" Ans is-->"+a+"/"+b+"="+(a/b));
		 	System.out.println("this is statement exceute if there is no error");
		 }
		 catch (ArrayIndexOutOfBoundsException obj)
		 {
		 	System.out.println("out of array bounds value read kartay"+obj);
		 }
		 catch(ArithmeticException obj)
		 {
		 	System.out.println(" value pathavali milat nasel"+obj);
		 }
		 catch (Exception e)
		 {
		 	System.out.println("common msg deyacha asel sarv= expection la,,,ja ghare"+e);
		 }
		 System.out.println(" remaining code executed code");
	}
}

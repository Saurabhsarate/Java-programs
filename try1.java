class try1
{
	public static void main(String args[])
	{
		System.out.println("\n Hello guys ..pls tell me if you understand..");
		try
		{
			System.out.println("Within try block");
		 	int a=Integer.parseInt(args[10]);
		 	int b=Integer.parseInt(args[0]);
		 	int c=a/b;
		 	System.out.println(" Ans is-->"+a+"/"+b+"="+(a/b));
		 	System.out.println("this is statement exceute if there is no error");
		 }
		 catch (ArithmeticException obj)
		 {
		 	System.out.println("error has been "+obj);
		 }
		 System.out.println("remaining code will executed");
	}
}
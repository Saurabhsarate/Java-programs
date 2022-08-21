class try2
{
	public static void main(String args[])
	{
		System.out.println("\n Hello guys ..pls tell me if you understand..");
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
		 	System.out.println("error has been "+obj);
		 }
		 finally
		 {
		 	System.out.println("\n Finally block always executed..execution occure or not?");
		 }
		 System.out.println(" remaining code executed code");
	}
}

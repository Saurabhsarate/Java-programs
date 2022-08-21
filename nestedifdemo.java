import java.util.*;
class nestedifdemo
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner (System.in);

		System.out.println("Enter the any four number");
		int a=s1.nextInt();
		int b=s1.nextInt();
		int c=s1.nextInt();
		int d=s1.nextInt();
		// int e=s1.nextInt();

	if(a>b)
	{
		if(a>c)
		System.out.println(a+" is maximum");
		else
			System.out.println(c+" is maximum");
	}
	else
	{
		if(b>d)
		System.out.println(b+" is maximum");
		else
			System.out.println(d+" is maximum");
	}
}
}
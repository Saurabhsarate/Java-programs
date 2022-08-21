import java.util.*;
class nestedifelsedemo
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("\n Enter the any three number");
		int a=s1.nextInt();
		int b=s1.nextInt();
		int c=s1.nextInt();
		if(a>b)
		{
			if(a>c)
				System.out.println(a+"is maximum");
				else
				System.out.println(c+"is maximum");
		}
		else
		{
			if(b>c)
			System.out.println(b+"is maximum");
			else
			System.out.println(c+"is maximum");
		}
	}
}
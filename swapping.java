import java.util.*;
class swapping
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("\n Enter the value of A and B");
		int a=s1.nextInt();
		int b=s1.nextInt();
		{
			a=a+b;
			b=a-b;
			a=a-b;
		}
		System.out.println("value of a="+a);
		System.out.println("value of b="+b);
	}
}
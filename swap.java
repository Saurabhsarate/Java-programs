import java.util.*;
class swap
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		int a=10;
		int b=20;
		System.out.println("Before swapping");
		System.out.println("First Number=+a");
		System.out.println("Second Number=+b");
		int temporary= a;
		a=b;
		b=temporary;
		System.out.println("After swapping");
		System.out.println("First Number=+a");
		System.out.println("Second Number=+b");
	}
}

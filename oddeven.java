import java.util.*;
class oddeven
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		int num;
		System.out.println("Enter the range");
	 num=s1.nextInt();

     for(int i=1; i<=num ;i++)
       {
			if(i % 2==0)
				System.out.println("The number  is Even -->"+i);
			else
				System.out.println("The number  is Odd--->"+i);
        }
	}
}

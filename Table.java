import java.util.*;
class Table
{
	public static void main(String args[])
	{
			Scanner s1=new Scanner(System.in);
			System.out.println("Enter the number that you want table=");
			int num=s1.nextInt();
			for(int i=1;i<=10;i++)
			{
				System.out.println(num+"*"+i+"="+num*i);
			}
	}
}

import java.util.*;
class table2
{
	public static void  main(String ags[])
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the number that you want a reverse table");
		int num=s1.nextInt();
		for(int i=10;i>=1;i--)
		{
				System.out.println(num+"*"+i+"="+num*i);
		}
	}
}
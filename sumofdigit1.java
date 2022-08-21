import java.util.*;
class sumofdigit1
{
		public static void main(String args[])
		{
			Scanner s1=new Scanner(System.in);
			System.out.println("\n Enter the number");
			int n=s1.nextInt();
			int sum=0;
			int x=n;
			while(n>0)
			{
					int r=n%10;
					sum=sum+r;
					n=n/10;
		}
		System.out.println("\n Sum of digit="+sum);
	}
}

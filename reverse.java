import java.util.*;
class reverse
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
					sum=sum*10+r;
					n=n/10;
		}
		System.out.println("\n reverse of digit="+sum);
	}
}
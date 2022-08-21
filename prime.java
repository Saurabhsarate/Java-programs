import java.io.*;
class prime
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the any number:");
		int n=Integer.parseInt(br.readLine());
		int i=2;
		while(i<n)
		{
				if(n%i==0)
				{
					System.out.println("\n Given no"+n+" is Not Prime");
					break;
				}
				i++;
		}
		if(n==i)
		System.out.println("\n Given no"+n+" is prime");
	}
}
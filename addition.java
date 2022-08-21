import java.io.*;
class addition
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\n Enter the two number =");
		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());
		 int c=a+b;
		System.out.println("\n Addition ="+c);
	}
}

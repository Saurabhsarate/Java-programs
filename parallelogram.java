import java .io.*;
class parallelogram
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\n value of A=");
		int A=Integer.parseInt(br.readLine());
		System.out.println("\n value of B=");
		int B=Integer.parseInt(br.readLine());
		double P=2* (A+B);
		System.out.println("\n perimeter of parallelogram="+P);
	}
}

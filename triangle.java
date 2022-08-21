import java.io.*;
class  triangle
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("\nEnter the breadth=");
			System.out.println("\nEnter the height=");
			int b=Integer.parseInt(br.readLine());
			float h=Float.parseFloat(br.readLine());
			double triangle=12*b*h;
			System.out.println("\nArea of triangle ="+triangle);
	}
}
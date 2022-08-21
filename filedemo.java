import java.io.*;
class filedemo
{
	public static void main(String args[]) throws IOException
	{
		File f1=new File("E:/SAURABH SARATE/COMPUTER/run programs/filedemo.java");
	System.out.println("\n File name="+f1.getName());
	System.out.println("\n Can Read="+f1.canRead());
	System.out.println("\n Can write="+f1.canWrite());
	System.out.println("\n Absolute Path="+f1.getAbsolutePath());
	System.out.println("\n Canonical Path="+f1.getCanonicalPath());
	System.out.println("\n Parent name="+f1.getParent());
	System.out.println("\n AbsolutePath aahe ka="+f1.isAbsolute());
	System.out.println("\n Directory aahe ka="+f1.isDirectory());
	System.out.println("\n File aahe ka="+f1.isFile());
	System.out.println("\n length of file="+f1.length());
		String s1[]=f1.list();
		for(int i=0;i<s1.length; i++)
	System.out.println("\n File name="+s1[i]);
	}
}

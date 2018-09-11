import java.io.*;
import java.util.*;
class filehandling
{
	public static void main(String args[])throws IOException
	{
		File f=new File("C:/Users/HP/Desktop/abc.txt");
		Scanner input = new Scanner(f);
		System.out.println("Contents:");
		while (input.hasNextLine())
		{
			System.out.println(input.nextLine());
		}
		System.out.println("Path:"+f.getAbsolutePath());
		
	}
}
		
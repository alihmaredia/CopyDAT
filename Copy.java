import java.util.*;
import java.io.*;
import static java.lang.System.*;


public class Copy {

	public static void main(String args[]) throws IOException
	{
		
		//Here is where you would input the values you want to output
		Scanner kb = new Scanner(new File("filename.dat"));
		
		while(kb.hasNext()) {
			out.println(kb.nextLine().trim());
		}
	}
}

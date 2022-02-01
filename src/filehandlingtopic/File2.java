package filehandlingtopic;

import java.io.File;
import java.io.IOException;

public class File2 {

	public static void main(String[] args) {
	File f1=new File("D:\\AAAA.txt");
try
{
	if(f1.createNewFile())
	{
		System.out.println("file created");
	}
	else
	{
		System.out.println("file not created");
	}
}
catch(IOException e)
{
	e.printStackTrace();
}
}
}

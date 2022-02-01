package filehandlingtopic;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File4 {

	public static void main(String[] args) {
	File f1=new File("D:\\apple.txt");
	try
	{
		FileWriter fw=new FileWriter(f1);
		fw.write("hello ");
		fw.write("dingi ");
		fw.write("how are you ");
		fw.flush();
	}
	catch(IOException e)
	{
		e.printStackTrace();
		
	}
	System.out.println("data is written");
	
	}

}

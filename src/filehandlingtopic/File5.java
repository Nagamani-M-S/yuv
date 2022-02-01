package filehandlingtopic;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File5 {

	public static void main(String[] args) {
	File f1=new File("D:\\apple.txt");
	try
	{
		FileWriter fw=new FileWriter(f1,true);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("job");
		bw.newLine();
		bw.write("fix");
		bw.flush();
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	System.out.println("data is written");

	}

}

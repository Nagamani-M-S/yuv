package filehandlingtopic;

import java.io.File;

public class File1 {

	public static void main(String[] args) {
	File f1=new File("D:\\abc");
	if(f1.mkdirs())
	{
		System.out.println("folder is created");
	}
	else
	{
		System.out.println("folder is not created");
	}
	if(f1.exists())
	{
		System.out.println("folder is exists");
	}
	else
	{
		System.out.println("folder not exists");
	}
	if(f1.delete())
	{
		System.out.println("folder is deleted");
	}
	else
	{
		System.out.println("folder is not deleted");
	}
	}

}

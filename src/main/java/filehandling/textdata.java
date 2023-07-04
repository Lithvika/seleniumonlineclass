package filehandling;
import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

public class textdata 
{
	String filepath = "C:\\Users\\Abhinav Prabhu\\eclipse-workspace\\Selenium\\src\\filehandling\\Inputdata\\Datatext.tx";
	String filename="Datatext.txt";

public void DataRead() throws IOException

{

	File F= new File(filepath+filename);
	FileInputStream FI = new FileInputStream(F);
	System.out.println((char)FI.read());
	
}

public static void main(String[] args) throws IOException
{
	textdata T = new textdata();
	T.DataRead();
}
}
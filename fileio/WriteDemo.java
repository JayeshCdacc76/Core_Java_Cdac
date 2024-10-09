package fileio;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class WriteDemo {

	public static void main(String[] args) throws IOException{
		
		FileReader fr = new FileReader("D:\\Jayesh\\Myfile.txt");

		FileOutputStream out = new FileOutputStream("D:\\Jayesh\\newFile.txt");
		
		int i;
		
		while((i=fr.read())!= -1)
		{
			out.write(i);
		}
		
		System.out.println("File Copied Successfully");
		
		fr.close();
		out.close();
	}

}

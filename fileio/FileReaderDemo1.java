package fileio;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo1 {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("D:\\Jayesh\\Myfile.txt");

			int i;

			while ((i = fr.read()) != -1) {
				System.out.print((char) i);
			}
			fr.close();
		} catch (IOException e) {
			System.out.println("Invalid File Path");
			System.out.println(e.getMessage());
		}

	}

}

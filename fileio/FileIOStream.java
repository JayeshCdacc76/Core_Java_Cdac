package fileio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FileIOStream {

	public static void main(String[] args) throws IOException {

		try {
			FileInputStream file = new FileInputStream("D:\\Jayesh\\Myfile.txt");

			int k;

			while ((k = file.read()) != -1) {
				System.out.print((char) k);
			}
			file.close();

		} catch (FileNotFoundException e) {
			System.out.println("Error : Invalid File Path ! Enter Valid path");
		}

	}

}

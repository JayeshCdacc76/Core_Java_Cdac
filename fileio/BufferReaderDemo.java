package fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDemo {

	public static void main(String[] args) throws IOException {

		File file = new File("D:\\Jayesh\\Myfile.txt");

		FileReader fr = new FileReader(file);

		BufferedReader br = new BufferedReader(fr, 200);// read upto 200 char at a time

		String str;

		while ((str = br.readLine()) != null) {
			System.out.println(str);
		}

		fr.close();
	}

}

package week9.day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LearnThrows {
	
	public static void setUpFileRead() throws FileNotFoundException,IOException {
		FileInputStream fis = new FileInputStream("./testData/test.xlsx");

	}
	

	public static void main(String[] args) throws IOException {
		setUpFileRead();
	}

}

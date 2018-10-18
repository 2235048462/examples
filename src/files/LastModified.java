package files;

import java.io.*;
import java.util.Date;

public class LastModified {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("test.txt");
		Long lastModified = file.lastModified();
		Date date = new Date(lastModified);
		System.out.println(date);
	}

}

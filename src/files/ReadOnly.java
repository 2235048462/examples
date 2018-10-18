package files;

import java.io.*;

public class ReadOnly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("readonly.txt");
		System.out.println(file.setReadOnly());
		System.out.println(file.canWrite());
	}

}

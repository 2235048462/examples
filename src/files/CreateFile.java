package files;

import java.io.*;

public class CreateFile {

	public static void main(String[] args) throws Exception {
		File file = null;
		File dir = new File("E:/eclipse-java/workspace/Mars/examples");
		file = File.createTempFile("JavaTemp",".txt",dir);
		System.out.println(file.getPath());
	}
}

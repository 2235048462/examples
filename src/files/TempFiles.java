package files;

import java.io.*;

public class TempFiles {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		File tempFile = File.createTempFile("tempfiles", ".txt");
		System.out.println("文件路径："+tempFile.getAbsolutePath());
		tempFile.deleteOnExit();
		FileWriter fileWriter = new FileWriter(tempFile);
		BufferedWriter out = new BufferedWriter(fileWriter);
		out.write("这是创建的临时文件...");
		System.out.println("临时文件创建完成...");
		out.close();
	}

}

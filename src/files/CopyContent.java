package files;

import java.io.*;

public class CopyContent {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		FileWriter fileWriter = new FileWriter("srcfile");
		BufferedWriter outWriter = new BufferedWriter(fileWriter);
		outWriter.write("我是被复制的内容。。。");
		outWriter.close();
		File file1 = new File("srcfile");
		File file2 = new File("destnfile");
		InputStream input = new FileInputStream(file1);
		OutputStream output = new FileOutputStream(file2);
		byte[] buf = new byte[1024];
		int len;
		len = input.read(buf);// 数组长度
		while (len > 0) {
			output.write(buf, 0, len);
			len = input.read(buf);
		}
		input.close();
		output.close();
		FileReader readFiles = new FileReader("destnfile");
		BufferedReader inReader = new BufferedReader(readFiles);
		String string;
		string = inReader.readLine();
		while (string != null) {
			System.out.println(string);
			string = inReader.readLine();
		}
		inReader.close();
	}

}

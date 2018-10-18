package files;

import java.io.*;

public class WriteFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileWriter fileWriter = new FileWriter("test.txt");
			BufferedWriter out = new BufferedWriter(fileWriter);
			out.write("写入内容到本文件");
			out.close();
			System.out.println("文件创建成功！");
		} catch (IOException e) {			
		}
	}

}

package files;

import java.io.*;

public class TempFiles {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		File tempFile = File.createTempFile("tempfiles", ".txt");
		System.out.println("�ļ�·����"+tempFile.getAbsolutePath());
		tempFile.deleteOnExit();
		FileWriter fileWriter = new FileWriter(tempFile);
		BufferedWriter out = new BufferedWriter(fileWriter);
		out.write("���Ǵ�������ʱ�ļ�...");
		System.out.println("��ʱ�ļ��������...");
		out.close();
	}

}

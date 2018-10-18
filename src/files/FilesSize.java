package files;

import java.io.*;

public class FilesSize {

	public static void main(String[] args) {		
		long size = getFileSize("test.txt");
		System.out.println("test.txt�ļ���СΪ��"+size);
	}
	
	public static long getFileSize(String filename) {
		File file = new File(filename);
		if (!file.exists() || !file.isFile()) {
			System.out.println("�ļ������ڡ�����");
			return -1;
		}
		return file.length();
	}

}

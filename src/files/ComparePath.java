package files;

import java.io.File;

public class ComparePath {

	public static void main(String[] args) {
		File file1 = new File("test.txt");
		File file2 = new File("newname.txt");
		if (file1.compareTo(file2) == 0) {
			System.out.println("�ļ�·��һ�£�");
		} else {
			System.out.println("�ļ�·����һ�£�");
		}
	}
}

package files;

import java.io.*;

public class WriteFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileWriter fileWriter = new FileWriter("test.txt");
			BufferedWriter out = new BufferedWriter(fileWriter);
			out.write("д�����ݵ����ļ�");
			out.close();
			System.out.println("�ļ������ɹ���");
		} catch (IOException e) {			
		}
	}

}

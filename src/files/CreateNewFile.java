package files;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			File file = new File("createnewfile.txt");
			if (file.createNewFile()) {
				System.out.println("�ļ������ɹ���");
			} else {
				System.out.println("�����ˣ��ļ�����ʧ�ܣ�");
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

}

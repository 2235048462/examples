package files;

import java.io.File;

public class DeleteFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			File file = new File("te.txt");
			if (file.delete()) {
				System.out.println(file.getName()+"�ļ��Ѿ���ɾ��");
			} else {
				System.out.println("�ļ�ɾ��ʧ�ܣ�");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

}

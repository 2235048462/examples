package files;

import java.io.*;

public class ReName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File oldName = new File("oldname.txt");
		File newName = new File("newname.txt");
		if (oldName.renameTo(newName)) {
			System.out.println("�Ѿ�������������");
		} else {
			System.out.println("Error...");
		}
	}

}

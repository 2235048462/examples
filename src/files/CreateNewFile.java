package files;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			File file = new File("createnewfile.txt");
			if (file.createNewFile()) {
				System.out.println("文件创建成功！");
			} else {
				System.out.println("出错了，文件创建失败！");
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

}

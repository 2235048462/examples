package files;

import java.io.File;

public class DeleteFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			File file = new File("te.txt");
			if (file.delete()) {
				System.out.println(file.getName()+"文件已经被删除");
			} else {
				System.out.println("文件删除失败！");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

}

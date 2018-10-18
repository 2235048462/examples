package files;

import java.io.File;
import java.util.Date;

public class ChangeDate {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		File changeFiles = new File("changedate");
		changeFiles.createNewFile();
		Date fileDate = new Date(changeFiles.lastModified());
		System.out.println(fileDate.toString());
		long systemDate = System.currentTimeMillis();
		System.out.println(changeFiles.setLastModified(systemDate));
		fileDate = new Date(changeFiles.lastModified());
		System.out.println(fileDate.toString());
	}

}

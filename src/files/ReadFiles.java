package files;

import java.io.*;

public class ReadFiles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileReader readFiles = new FileReader("te.txt");
			BufferedReader in = new BufferedReader(readFiles);
			String string;
			string = in.readLine();
			while (string != null) {				
				System.out.println(string);
				string = in.readLine();
			}
			System.out.println(string);
		} catch (IOException e) {
			// TODO: handle exception
		}
	}

}

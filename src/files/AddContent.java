package files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AddContent {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		try {
			FileWriter fileWriter = new FileWriter("filename");
			BufferedWriter out = new BufferedWriter(fileWriter);
			out.write("我是原内容...\n");
			out.close();
			FileWriter fileWriter2 = new FileWriter("filename",true);
			out = new BufferedWriter(fileWriter2);
			out.write("我是新加的内容...\n");
			out.close();
			FileReader readFile = new FileReader("filename");
			BufferedReader in = new BufferedReader(readFile);
			String string;
			string = in.readLine();
			while (string != null) {
				System.out.println(string);
				string = in.readLine();
			}
			in.close();
		} catch (IOException e) {
			System.out.println("exception occoured" + e);
		}
	}

}

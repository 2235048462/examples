package network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;

public class WebClaw {
	public static void main(String[] args) throws Exception {
		URL url = new URL("http://baidu.com");
		BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
		BufferedWriter writer = new BufferedWriter(new FileWriter("data.html"));
		String line = reader.readLine();
		while (line != null) {
			System.out.println(line);
			writer.write(line);
			writer.newLine();
			line = reader.readLine();
		}
		reader.close();
		writer.close();
	}
}

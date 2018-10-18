package network;

import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeStamp {
	public static void main(String[] args) throws Exception {
		URL url = new URL("http://127.0.0.1/test/test.html");
		URLConnection urlConnection = url.openConnection();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		urlConnection.setUseCaches(false);
		long timestamp = urlConnection.getLastModified();
		System.out.println("test.html 文件最后修改的时间：" + dateFormat.format(new Date(timestamp)));
	}
}

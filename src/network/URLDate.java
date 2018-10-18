package network;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;

public class URLDate {
	public static void main(String[] args) throws Exception {
		URL url = new URL("http://baidu.com");
		HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
		long date = urlConnection.getDate();
		if (date <= 0) {
			System.out.println("无法获取信息");
		} else {
			System.out.println("Date:" + new Date(date));
		}
	}
}

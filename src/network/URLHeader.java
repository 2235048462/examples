package network;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class URLHeader {
	public static void main(String[] args) throws IOException {
		URL url = new URL("http://baidu.com");
		URLConnection urlConnection = url.openConnection();
		Map<String, List<String>> headers = urlConnection.getHeaderFields();
		Set<String> keys = headers.keySet();
		for (String key : keys) {
			String value = urlConnection.getHeaderField(key);
			System.out.println(key + ":" + value);

		}
		System.out.println(urlConnection.getLastModified());
	}
}

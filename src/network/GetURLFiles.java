package network;

import java.net.URL;
import java.net.URLConnection;

public class GetURLFiles {
	public static void main(String[] args) throws Exception {
		int size;
		URL url = new URL("https://img.alicdn.com/tps/i3/T1OjaVFl4dXXa.JOZB-114-114.png");
		URLConnection urlConnection = url.openConnection();
		size = urlConnection.getContentLength();
		if (size < 0) {
			System.out.println("�޷���ȡ�ļ���С��");
		} else {
			System.out.println("�ļ���СΪ:" + size + "bytes");
		}
		urlConnection.getInputStream().close();
	}
}

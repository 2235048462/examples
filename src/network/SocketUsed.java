package network;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketUsed {
	public static void main(String[] args) {
		Socket socket;
		String host = "localhost";
		if (args.length > 0) {
			host = args[0];
		}
		for (int i = 8070; i < 9090; i++) {
			try {
				System.out.println("�鿴" + i);
				socket = new Socket(host, i);
				System.out.println("�˿�" + i + "�ѱ�ʹ��");
			} catch (UnknownHostException e) {
				System.out.println("Exception occured" + e);
				break;
			} catch (IOException e) {
			}
		}
	}
}

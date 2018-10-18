package network;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class SocketConnectionHost {
	public static void main(String[] args) {
		try {
			InetAddress address;
			Socket socket = new Socket("www.cctv.com", 80);
			address = socket.getInetAddress();
			System.out.println("连接到" + address);
			socket.close();
		} catch (IOException e) {
			System.out.println("无法连接" + args[0]);
			System.out.println(e);
		}
	}
}

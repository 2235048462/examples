package network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketCommunication_Client {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("127.0.0.1", 8888);

			// 构建输入输出流
			InputStream inputStream = socket.getInputStream();
			OutputStream outputStream = socket.getOutputStream();

			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));
			// 向服务器端发送一条消息
			writer.write("测试客户端与服务器通信,服务器接收到消息后,返回客户端\n");
			writer.flush();

			// 读取服务器返回的消息
			BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
			String messages = reader.readLine();
			System.out.println("服务器返回的消息:" + messages);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

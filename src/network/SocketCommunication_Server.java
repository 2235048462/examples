package network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketCommunication_Server {
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(8888);
			System.out.println("启动服务器...");
			Socket socket = serverSocket.accept();
			System.out.println("客户端" + socket.getInetAddress().getHostAddress() + "已连接服务器.");

			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// 读取客户端发送来的消息
			String messages = reader.readLine();
			System.out.println("客户端发送来的消息:" + messages);
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			writer.write(messages + "\n");
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

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
			System.out.println("����������...");
			Socket socket = serverSocket.accept();
			System.out.println("�ͻ���" + socket.getInetAddress().getHostAddress() + "�����ӷ�����.");

			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// ��ȡ�ͻ��˷���������Ϣ
			String messages = reader.readLine();
			System.out.println("�ͻ��˷���������Ϣ:" + messages);
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			writer.write(messages + "\n");
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

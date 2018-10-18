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

			// �������������
			InputStream inputStream = socket.getInputStream();
			OutputStream outputStream = socket.getOutputStream();

			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));
			// ��������˷���һ����Ϣ
			writer.write("���Կͻ����������ͨ��,���������յ���Ϣ��,���ؿͻ���\n");
			writer.flush();

			// ��ȡ���������ص���Ϣ
			BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
			String messages = reader.readLine();
			System.out.println("���������ص���Ϣ:" + messages);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

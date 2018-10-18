package network;

import java.net.InetAddress;

public class LocalAddress {
	public static void main(String[] args) throws Exception {
		InetAddress address = InetAddress.getLocalHost();
		String hostaddress = address.getHostAddress();
		System.out.println("Local HostAddress:" + hostaddress);
		String hostname = address.getHostName();
		System.out.println("Local HostName:" + hostname);
	}
}

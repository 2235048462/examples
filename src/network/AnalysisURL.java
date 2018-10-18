package network;

import java.net.URL;

public class AnalysisURL {
    public static void main ( String[] args ) throws Exception {
        URL url = new URL ( "http://baidu.com" );
        System.out.println ( "URL:" + url.toString () );
        System.out.println ( "协议:" + url.getProtocol () );
        System.out.println ( "文件:" + url.getFile () );
        System.out.println ( "主机:" + url.getHost () );
        System.out.println ( "路径:" + url.getPath () );
        System.out.println ( "端口:" + url.getPort () );
        System.out.println ( "默认端口:" + url.getDefaultPort () );
    }
}

package network;

import java.net.URL;

public class AnalysisURL {
    public static void main ( String[] args ) throws Exception {
        URL url = new URL ( "http://baidu.com" );
        System.out.println ( "URL:" + url.toString () );
        System.out.println ( "Э��:" + url.getProtocol () );
        System.out.println ( "�ļ�:" + url.getFile () );
        System.out.println ( "����:" + url.getHost () );
        System.out.println ( "·��:" + url.getPath () );
        System.out.println ( "�˿�:" + url.getPort () );
        System.out.println ( "Ĭ�϶˿�:" + url.getDefaultPort () );
    }
}

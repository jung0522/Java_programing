import network.MultiClientServer;

/**
 * ��ƼŬ���̾�Ʈ ���� Main Ŭ����
 * @author So Young Park
 * @version 0.8
 */	
public class MultiClientServer_Main
{	 
	public static void main(String[] args) 
	{
		MultiClientServer server = new MultiClientServer();
		server.connectAsMultiClientServer();
	}
}

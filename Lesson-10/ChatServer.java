import java.io.*;
import java.util.ArrayList;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer
{

	static ArrayList<String> userNames = new ArrayList<String>();
	static ArrayList<PrintWriter> printWriters = new ArrayList<PrintWriter>();

	public static void main(String[] args) throws Exception
	{
		System.out.println("Waiting for clients....");

		ServerSocket ss = new ServerSocket(5000);	

		while(true)
		{
			Socket soc = ss.accept();
			System.out.println("Connection established");

			ConversationHandler conversationHandler = new ConversationHandler(soc);
			conversationHandler.start();
		}
	}
}
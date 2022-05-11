import java.io.IOException;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ConversationHandler extends Thread
{
	Socket socket;
	BufferedReader in;
	PrintWriter out;
	String name;
	String serverMessage;
	String clientMessage;

	public ConversationHandler(Socket socket) throws IOException
	{
		this.socket = socket;
	}

	@Override
	public void run()
	{
		try 
		{
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream(), true);

			int count = 0;

			while(true) 
			{
				if(count > 0) 
					out.println("NAMEALREADYEXIST");
				else
					out.println("NAMEREQUIRED");

				name = in.readLine();

				if(name == null)
					out.println("NAMEREQUIRED");

				if(!ChatServer.userNames.contains(name))
				{	
					ChatServer.userNames.add(name);
					break;
				}

				count++;
			}

			out.println("NAMEACCEPTED" + name);
			//NAMEACCEPTEDdenver
			ChatServer.printWriters.add(out);

			serverMessage = "Server : " + name +" joined the chat";
			sendtoAll(serverMessage);

			while(true)
			{
				String message = in.readLine();

				if(message == null) {
					return;
				else if(message.equals("EXIT"))
					disconnectClient();
				else 
					clientMessage = name + ": " + message;
					sendtoAll(clientMessage);
			}
		}
		catch (Exception e)
		{
			System.out.println("Error : " + e.toString());
		}
	}

	protected void sendtoAll(String message)
	{
		for(PrintWriter writer : ChatServer.printWriters)
			writer.println(message);
	}

	protected void disconnectClient()
	{
		serverMessage = "DISCONNECTED" + name;
		sendtoAll(serverMessage);

		ChatServer.userNames.remove(name);
	}
}